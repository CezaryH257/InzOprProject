package parser;
import java.util.ArrayList;
import java.util.List;

/**
 * Ta klasa reprezentuje lekcje oraz przechowuje jej parametry
 * @author Krzysztof Kawski
 *
 */
public class Lesson {
	private String subGroup;
	private String startTime;
	private String endTime;
	private String classType;
	private String subject;
	private String teacher;
	private String classRoom;
	private List <String> dueDatesList = new ArrayList<>();
	private String infoAboutDueDates;
	private String dayOfWeek;

	public Lesson(){};
	
	@Override
	public String toString() {
		return "Lesson [subGroup=" + subGroup
				+ ", startTime=" + startTime
				+ ", endTime=" + endTime
				+ ", classType=" + classType
				+ ", subject=" + subject
				+ ", teacher=" + teacher
				+ ", classRoom=" + classRoom
				+ ", dueDatesList=" + dueDatesList 
				+ ", dayOfWeek=" + dayOfWeek
				+ ", infoAboutDueDates=" + infoAboutDueDates
				+ "]";
	}

	
	/** Metoda zwraca podgrupe
	 * @return subGroup obiekt typu String reprezentujacy podgrupe
	 */
	public String getSubGroup() {
		return subGroup;
	}
	
	/** Metoda ta ustawia  podgrupe na te podana w parametrze subGroup
	 * @param subGroup obiekt typu string zawierajacy podgrupe 
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	/** Metoda zwraca godzine rozpaczenia zajec
	 * @return startTime obiekt typu String
	 */
	public String getStartTime() {
		return startTime;
	}
	
	/** Metoda ta ustawia  godzine rozpoczecia zajec na te podana w parametrze startTime
	 * @param  startTime obiekt typu string zawierajacy godzine rozpoczecia zajec
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	/** Metoda ta zwraca czas zakonczenia zajec 
	 * @return endTime obiekt typu String
	 */
	public String getEndTime() {
		return endTime;
	}
	
	/** Metoda ta ustawia  godzine zakonczenia zajec na te podana w parametrze endTime
	 * @param endTime obiekt typu String zawierajacy godzinie zakonczenia zajec
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/** Metoda ta zwraca typ zajec
	 * @return classType obiekt typu String 
	 */
	public String getClassType() {
		return classType;
	}

	/** Metoda ta ustawia typ zajec na ten podany w parametrze classType
	 * @param classType obiekt typu String zawierajacy nazwe grupy
	 */
	
	public void setClassType(String classType) {
		this.classType = classType;
	}

	/** Metoda ta zwraca nazwe  przedmiotu
	 * @return subject obiekt typu String
	 */
	public String getSubject() {
		return subject;
	}
	
	/** Metoda ta ustawia nazwe przedmiotu na te podana w parametrze subject
	 * @param  subject obiekt typu String zawierajacy nazwe przedmiotu
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/** Metoda da zwraca nazwisko nauczyciela
	 * @return Obiekt typu String 
	 */
	public String getTeacher() {
		return teacher;
	}
	
	/** Metoda ta ustawia nazwisko nauczyciela na te podane w parametrze setTeacher
	 * @param teacher Obiekt typu String zawierajacy nazwisko nauczyciela
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	/**Metoda ta zwraca nazwe (numer) sali
	 * @return  classRoom obiekt typu String
	 */
	public String getClassRoom() {
		return classRoom;
	}
	
	/** Metoda ta ustawia nazwe sali na te podana w parametrze classRoom
	 * @param classRoom obiekt typu String zawierajacy nazwe sali
	 */
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	
	/** Ta metoda zwraca liste dat
	 * @return dueDatesList lista typu String 
	 */
	public List<String> getTerm() {
		return dueDatesList;
	}
	
	/** Metoda ta ustawia liste dat na te podana w parametrze dueDateList
	 * @param term lista typu String zawierajaca liste dat 
	 */
	public void setTerm(List<String> term) {
		this.dueDatesList = term;
	}

	/**
	 * @return Metoda zwraca liste terminow
	 */
	public List<String> getDueDate() {
		return dueDatesList;
	}

	/**
	 * Metoda ta ustawia daty odbycia sie zajec na te z listy podanej
	 * w parametrze 
	 * @param dueDate - data odbycia
	 */
	public void setDueDate(List<String> dueDate) {
		this.dueDatesList = dueDate;
	}

	/** Metoda ta zwraca dzien tygodnia
	 * @return dayOfWeek obiekt typu String 
	 */
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	/** Metoda ta ustawia dzien na ten podana w parametrze DayOfWeek
	 * @param dayOfWeek obiekt typu String zawierajacy dzien 
	 */
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	/**
	 * Metoda zwraca liste z datami wykonania
	 * @return dueDatesList z datami wykonania
	 */
	public List<String> getDueDatesList() {
		return dueDatesList;
	}
	
	/**
	 * Metoda ta ustwia daty wykonania na te podane w liscie
	 * @param dueDatesList z datami wykonania
	 */
	public void setDueDatesList(List<String> dueDatesList) {
		this.dueDatesList = dueDatesList;
	}
	
	/** Metoda ta zwraca informacje o dacie odbycia
	 * @return infoAboutDueDates obiekt typu String
	 */
	public String getInfoAboutDueDates() {
		return infoAboutDueDates;
	}
	
	/** Metoda ta ustawia informacjeo dacie na te podana w parametrze infoAboutDates
	 * @param infoAboutDueDates obiekt typu String zawierajacy informacje o dacie
	 */
	public void setInfoAboutDueDates(String infoAboutDueDates) {
		this.infoAboutDueDates = infoAboutDueDates;
	}
}
