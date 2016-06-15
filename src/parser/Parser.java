package parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * @author Krzysztof Kawski
 *
 */
public class Parser {
	private TimeTable timeTableRef;
	private String pageAddress;
	
	
	/** Konstruktor ustawia podany jako parametr adres strony (pageAddress) i obiekt planu lekcji 
	 * @param pageAddress  obiekt typu String zawierajacy adres strony 
	 * @param timeTableRef  obiekt typu TimeTable zawierajacy plan zajec w formie listy
	 */
	public Parser(String pageAddress , TimeTable timeTableRef){
		this.timeTableRef = timeTableRef;
		this.pageAddress = pageAddress;
	}
	
	
	/**
	 * Metoda odpowiedzialna za sparsowanie strony o adresie (pageAddress), podanym w konstruktorze Klasy Parser
	 * jako argument, a nastepnie za wyeksportowanie sparsowanych danych do obiektu planu zajec (TimeTable). 
	 * KaĹĽdy parametr zajec znajduje sie w osobnym polu klasy Lesson.
	 * 
	 * 
	 * @throws Metoda ta rzuca wyjatek IOException
	 */
	public void parsePageSource () throws IOException{
		String actualDayOfWeekName = null;
		
		Document doc = Jsoup.parse(downloadPageSource(pageAddress) , "http://plan.uz.zgora.pl");
		
		Elements tableElements = doc.getElementsByTag("table");
		Element secondTableElement = tableElements.get(1);
		
		Elements trElements = secondTableElement.getElementsByTag("tr");
		
		trElements.remove(0);
		
		for (int i = 0 ; i < trElements.size() ; i++){
			Element trElement = trElements.get(i);
			
			if (isDayOfWeekName(trElement.text())){
				actualDayOfWeekName = trElement.text();
				continue;
			}
			
			Lesson lesson = new Lesson ();
			Elements tdElements = trElement.getElementsByTag("td");
			
			lesson.setSubGroup(tdElements.get(0).text());
			lesson.setStartTime(tdElements.get(1).text());
			lesson.setEndTime(tdElements.get(2).text());
			lesson.setSubject(tdElements.get(3).text());
			lesson.setClassType(tdElements.get(4).text());
			lesson.setTeacher(tdElements.get(5).text());
			lesson.setClassRoom(tdElements.get(6).text());
			lesson.getDueDatesList().addAll(getDueDates(tdElements.get(7) , actualDayOfWeekName));
			lesson.setInfoAboutDueDates(getInfoAboutDueDates(tdElements.get(7).text()));
			lesson.setDayOfWeek(actualDayOfWeekName);
			timeTableRef.addLessonToList(lesson);
			System.out.println(lesson);
		}
		
	}
	
	/**
	 * Metoda sluzaca do pobrania zrodla strony o podanym adresie (pageAddress) w formie Stringu z kodem HTML.
	 * 
	 * @param pageAddress - adres WWW strony internetowej
	 * @return zrodlo strony w formie Stringu z kodem HTML
	 * @throws Metoda ta moze rzucic wyjatek IOException
	 */
	private String downloadPageSource (String pageAddress) throws IOException{
		URL pageAddr = new URL(pageAddress);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(pageAddr.openStream() , "UTF-8"));
		
		StringBuilder pageSrc = new StringBuilder();
		String tmp = null;
		
		while ((tmp = in.readLine()) != null)
			pageSrc.append(tmp);
		
		in.close();
		
		return pageSrc.toString();		
	}
	
	/**
	 * Metoda zwraca ArrayListe sparametryzowana na String z nazwami dni tygodnia w jezyku polskim
	 * @return ArrayList <String> z nazwami dni tygodnia w jezyku polskim
	 */
	private ArrayList <String> getDayOfWeekNames (){
		ArrayList <String> result = new ArrayList<>();
		
		result.add("PoniedziaĹ‚ek");
		result.add("Wtorek");
		result.add("Ĺšroda");
		result.add("Czwartek");
		result.add("PiÄ…tek");
		result.add("Sobota");
		result.add("Niedziela");
		
		return result;
	}
	
	/**
	 * Metoda, ktorej zadaniem jest zwrocic informacje czy podany jako parametr String
	 * jest nazwa dnia tygodnia w jezyku polskim 
	 * 
	 * @param dayOfWeekName nazwa dnia tygodnia w jezyku polskim
	 * @return true, wtedy i tylko wtedy, gdy podany String (dayOfWeekName)
	 * jest nazwa dnia tygodnia w jezyku polskim; false w przeciwnym wypadku
	 */
	private boolean isDayOfWeekName (String dayOfWeekName){
		ArrayList <String> dayOfWeekNames = getDayOfWeekNames();
		
		if (dayOfWeekNames.contains(dayOfWeekName))
			return true;
		return false;
	}
	
	
	/**
	 * Po natknieciu sie na pierwszy znak "/" (slash, separator), sczytywany jest ciag znakow,
	 * po nim wystepujacy.
	 * 
	 * @param dowolny ciag znakow w formie Stringa 
	 * @return zwracany jest String przedstawiajacy informacje dotyczace dat w ktorych odbywaja sie zajecia
	 *  (informacja pobrana z sekcji terminy i uwagi)
	 */
	private String getInfoAboutDueDates(String string){
		final String SEPARATOR = "/";
		int indexOfSeparator;
		String result = null;
		
		indexOfSeparator = string.indexOf(SEPARATOR);
		
		result = string.subSequence(indexOfSeparator, string.length() - 1).toString();
		
		return result;
	}
	
	/**
	 * Funkcja wybiera daty w ktorych odbywaja sie zajecia, a nastepnie zwraca je w formie ArrayListy sparametryzowanej na String
	 * 
	 * @param tdElementContainsDueDates - obiekt typu Element zawierajÄ…cy elementy o znacznikach <td> kodu HTML
	 * @param lessonDayOfWeekName - nazwa dnia tygodnia w ktorym odbywaja sie dane zajecia
	 * @return ArrayList <String> z terminami w ktorych odbywaja sie zajecia
	 * @throws metoda moze rzucic wyjatek UnsupportedEncodingException
	 * @throws metoda moze rzucic wyjatek IOException
	 */
	private ArrayList <String> getDueDates(Element tdElementContainsDueDates , String lessonDayOfWeekName) throws UnsupportedEncodingException, IOException{
		final String DATE_PATTERN = "[0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]";
		ArrayList <String> result = null;
		Element element = tdElementContainsDueDates;
		
		Element aElement = element.getElementsByTag("a").first();
		String link = aElement.attr("abs:href");
		String text = aElement.text();
		
		result = getDatesFromString(text, DATE_PATTERN);
		
		if (result == null){
			result = getDatesFromSubpage (link , text , lessonDayOfWeekName);
		}
		
		return result;
	}
	
	
	/**
	 * Metoda ta pobiera daty z podstrony o adresie (subPageLink),
	 * a dokladnie z tabel, ktore tycza sie zajec danego typu (classType)
	 * o adresie subPageLink, a nastepnie zwraca je w postaci ArrayListy
	 * sparametryzowanej na String
	 * 
	 * @param subpageLink - link do podstrony z ktorej metoda pobierze daty
	 * @param classType - typ zajec (np. W , L , P)
	 * @param lessonDayOfWeekName - dzien tygodnia w ktorym odbywaja sie dane zajecia
	 * @return ArrayList <String> z datami w formie StringĂłw
	 * @throws metoda moze rzucic wyjatek UnsupportedEncodingException
	 * @throws metoda moze rzucic wyjatek IOException
	 */
	private ArrayList <String> getDatesFromSubpage (String subpageLink , String classType , String lessonDayOfWeekName) throws UnsupportedEncodingException, IOException{
		final String tableRegex = "\\s-\\s.*((?i)(<table.*</table>))";
		String pageContent = null;
		
		StringBuilder patternToMatchAsStringB = new StringBuilder();
	
		patternToMatchAsStringB.append(classType);
		patternToMatchAsStringB.append(tableRegex);
		
		try {
			pageContent = downloadPageSource(subpageLink);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Pattern patternToMatch = Pattern.compile(patternToMatchAsStringB.toString());
		
		Matcher matcher = patternToMatch.matcher(pageContent);
		
		String matchedText = null;
		
		try{
			matcher.find();
			matchedText = matcher.group();
		} catch (IllegalStateException ex){
			ex.printStackTrace();
		}
		
		Document doc = Jsoup.parse(matchedText);
		
		Element dueDatesTable = doc.getElementsByTag("table").first();
		
		Elements trElements = dueDatesTable.getElementsByTag("tr");
		
		ArrayList <String> dueDatesList = new ArrayList<>();
		for (int i = 0 ; i < trElements.size() ; i++){
			Elements tdElements = trElements.get(i).getElementsByTag("td");
			
			if (tdElements.size() == 0) {continue;}
				
				
			String dayOfWeekNameByTimetable = tdElements.get(2).text();
			String date = tdElements.get(1).text();
			
			if (dayOfWeekNameByTimetable.equals(lessonDayOfWeekName)){
				dueDatesList.add(date);
			}
		}	
		return dueDatesList;
	}
	
	
	/**
	 * Metoda ta pobiera daty z podanego jako parametr Stringa (string).
	 * Daty musza zgadzac sie ze wzorcem (wyrazeniem regularnym) (pattern).
	 * 
	 * @param string
	 * @param pattern
	 * @return
	 */
	private ArrayList<String> getDatesFromString (String string , String pattern){
		ArrayList <String> result = new ArrayList<>();
		
		Pattern patternObj = Pattern.compile(pattern);
		Matcher matcher = patternObj.matcher(string);
		
		while(true){
			if (matcher.find()){
				String match = matcher.group();
				result.add(match);
			} else {
				break;
			}
		}
		if (result.size() == 0)
			return null;
		else
			return result;
	}
	
	/**
	 * @return metoda ta zwraca adres strony
	 */
	public String getPageAddress() {
		return pageAddress;
	}

	/**
	 * @param pageAddress metoda ta ustawia podany jako parametr (pageAddress) adres strony 
	 */
	public void setPageAddress(String pageAddress) {
		this.pageAddress = pageAddress;
	}

}
