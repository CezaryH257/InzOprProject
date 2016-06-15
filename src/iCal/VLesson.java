package iCal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Klasa zamienia obiekty z klasy Lesson na eventy ktore mozna eksportowac do
 * iCal
 * 
 * @author Robert Piêkny
 */
public class VLesson {
	private ArrayList<Date> dates;
	private Lesson lesson;

	/**
	 * Konstruktor przekazuje lesson do pola lesson zeby mozna go bylo uzywac w
	 * metodach i tworzy nowa ArrayList typu Date i wywoluje metode
	 * transferDates()
	 * 
	 * @param lesson
	 */
	public VLesson(Lesson lesson) {
		this.lesson = lesson;
		dates = new ArrayList<Date>();
		transferDates();
	}

	/**
	 * Metoda pobiera daty i czas rozpoczecia wydarzen oraz zmienia format daty
	 */
	private void transferDates() {
		for (int i = 0; i < lesson.getTerm().size(); i++) {
			dates.add(formatDate(lesson.getTerm().get(i) + ";" + lesson.getStartTime() + ":00",
					new SimpleDateFormat("dd-MM-yyyy;hh:mm:ss")));
		}
	}

	/**
	 * Metoda zmieniaj¹ca format date. Zamienia date typu String na date typu
	 * Date
	 * 
	 * @param date
	 *            - obiekt typu String do sformatowania na obiekt typu date
	 * @param dateFormat
	 *            - obiekt typy DateFormat reprezentujacy format parametru date
	 * @return Zwraca pobrana date w formacie Date
	 */
	private Date formatDate(String date, DateFormat dateFormat) {
		try {
			return dateFormat.parse(date + ";" + lesson.getStartTime() + ":00");
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Metoda zwraca godziny
	 * 
	 * @param s
	 *            obiekt typu String
	 * @return Metoda zwraca wyciaga godziny z stringa
	 */
	private int getHour(String s) {
		return Integer.parseInt(s.substring(0, 2));

	}

	/**
	 * Metoda zwraca minuty po pobraniu jej z daty
	 * 
	 * @param s
	 *            obiekt typu String
	 * @return Metoda zwraca wyciagniete minuty z string
	 */
	private int getMinute(String s) {
		return Integer.parseInt(s.substring(3, 5));
	}

	/**
	 * Metoda zwraca czas trwania wydarzenia Metoda odejmuje godzine konca
	 * wydarzenia od poczatku wydarzenia oraz minuty z czasu koncowego od minut
	 * z czasu poczatkowego
	 * 
	 * @return Metoda zwraca czas trwania wydarzenia w minutach
	 */
	public int getDuration() {
		int hours = getHour(lesson.getEndTime()) - getHour(lesson.getStartTime());
		int minutes = getMinute(lesson.getEndTime()) - getMinute(lesson.getStartTime());
		return hours * 60 + minutes;
	}

	/**
	 * Metoda zwraca opis wydarzenia jako przedmiot, numer grupy, nazwe podgrupy
	 * oraz nauczyciela.
	 * 
	 * @return Metoda zwraca opis wydarzenia
	 */
	public String getDescription() {
		return lesson.getSubject() + "  | " + lesson.getClassType() + " |  " + lesson.getSubGroup() + "  "
				+ lesson.getTeacher();
	}

	/**
	 * Metoda zwraca ilosc dat
	 * 
	 * @return zwraca ilosc dat
	 */
	public int getDatesAmount() {
		return dates.size();
	}

	/**
	 * Metoda zwraca date z podanego indexu z arraylisty
	 * 
	 * @param index
	 *            - obiekt typu int
	 * @return zwraca date z podanego indeksu listy
	 */
	public Date getDateByIndex(int index) {
		return dates.get(index);
	}
}