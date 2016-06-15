package parser;
import java.util.ArrayList;

/** Klasa reprezentująca plan lekcji w formie listy obiektów Lesson
 * @author Krzysztof Kawski
 *
 */
public class TimeTable {
	private ArrayList <Lesson> lessonList;
	
	
	/** Konstruktor tworzy nowy obiekt typu TimeTable i przypisuje
	 * referencji lessonList nowy obiekt typu ArrayList
	 */
	public TimeTable() {
		super();
		this.lessonList = new ArrayList<>();
	}

	/** Metoda ta dodaje lekcję do listy lekcji
	 * @param lesson - obiekt lekcji
	 */
	public void addLessonToList (Lesson lesson){
		lessonList.add(lesson);
	}
	
	/** Metoda ta zwraca liste lekcji
	 * @return lessonList - lista zawierająca lekcje
	 */
	public ArrayList<Lesson> getLessonList() {
		return lessonList;
	}

	/** Metoda ta ustawia  liste zajeć na te podaną w parametrze lessonList
	 * @param lessonList - lista z zajęciami
	 */
	public void setLessonList(ArrayList<Lesson> lessonList) {
		this.lessonList = lessonList;
	}
}
