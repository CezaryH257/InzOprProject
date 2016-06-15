package parser;
import java.util.ArrayList;
import java.util.List;

/**
 * Ta klasa reprezentuje lekcję oraz przechowuje jej parametry
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

	
	/** Metoda zwraca podgrupę
	 * @return subGroup obiekt typu String reprezentujący podgrupę
	 */
	public String getSubGroup() {
		return subGroup;
	}
	
	/** Metoda ta ustawia  podgrupę na te podaną w parametrze subGroup
	 * @param subGroup obiekt typu string zawierający podgrupę 
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	/** Metoda zwraca godzine rozpaczenia zajeć
	 * @return startTime obiekt typu String
	 */
	public String getStartTime() {
		return startTime;
	}
	
	/** Metoda ta ustawia  godzinę rozpoczęcia zajeć na te podaną w parametrze startTime
	 * @param  subGroup obiekt typu string zawierający godzinę rozpoczęcia zajęć
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	/** Metoda ta zwraca czas zakończenia zajęć 
	 * @return endTime obiekt typu String
	 */
	public String getEndTime() {
		return endTime;
	}
	
	/** Metoda ta ustawia  godzinę zakończenia zajeć na te podaną w parametrze endTime
	 * @param endTime obiekt typu String zawierający godzinie zakończenia zajęć
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/** Metoda ta zwraca typ zajęć
	 * @return classType obiekt typu String 
	 */
	public String getClassType() {
		return classType;
	}

	/** Metoda ta ustawia typ zajęć na ten podany w parametrze classType
	 * @param classType obiekt typu String zawierający nazwę grupy
	 */
	
	public void setClassType(String classType) {
		this.classType = classType;
	}

	/** Metoda ta zwraca nazwę  przedmiotu
	 * @return subject obiekt typu String
	 */
	public String getSubject() {
		return subject;
	}
	
	/** Metoda ta ustawia nazwę przedmiotu na te podaną w parametrze subject
	 * @param  subject obiekt typu String zawierający nazwę przedmiotu
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
	
	/** Metoda ta ustawia nazwisko nauczyciela na te podaną w parametrze setTeacher
	 * @param  Obiekt typu String zawierający nazwisko nauczyciela
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	/**Metoda ta zwraca nazwę (numer) sali
	 * @return  classRoom obiekt typu String
	 */
	public String getClassRoom() {
		return classRoom;
	}
	
	/** Metoda ta ustawia nazwę sali na te podaną w parametrze classRoom
	 * @param classRoom obiekt typu String zawierający nazwę sali
	 */
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	
	/** Ta metoda zwraca listę dat
	 * @return dueDatesList lista typu String 
	 */
	public List<String> getTerm() {
		return dueDatesList;
	}
	
	/** Metoda ta ustawia listę dat na te podaną w parametrze dueDateList
	 * @param dueDatesList lista typu String zawierająca listę dat 
	 */
	public void setTerm(List<String> term) {
		this.dueDatesList = term;
	}

	/**
	 * @return Metoda zwraca listę terminów
	 */
	public List<String> getDueDate() {
		return dueDatesList;
	}

	/**
	 * Metoda ta ustawia daty odbycia się zajęć na te z listy podanej
	 * w parametrze 
	 * @param dueDate
	 */
	public void setDueDate(List<String> dueDate) {
		this.dueDatesList = dueDate;
	}

	/** Metoda ta zwraca dzień tygodnia
	 * @return dayOfWeek obiekt typu String 
	 */
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	/** Metoda ta ustawia dzień na ten podaną w parametrze DayOfWeek
	 * @param dayOfWeek obiekt typu String zawierający dzień 
	 */
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	/**
	 * Metoda zwraca listę z datami wykonania
	 * @return List<String> z datami wykonania
	 */
	public List<String> getDueDatesList() {
		return dueDatesList;
	}
	
	/**
	 * Metoda ta ustwia daty wykonania na te podane w liście
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
	
	/** Metoda ta ustawia informacjeo dacie na te podaną w parametrze infoAboutDates
	 * @param infoAboutDueDates obiekt typu String zawierający informacje o dacie
	 */
	public void setInfoAboutDueDates(String infoAboutDueDates) {
		this.infoAboutDueDates = infoAboutDueDates;
	}
}
