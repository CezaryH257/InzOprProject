package parser;
import java.util.ArrayList;

/** Klasa reprezentujaca plan lekcji w formie listy obiektow Lesson
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

	/** Metoda ta dodaje lekcje do listy lekcji
	 * @param lesson - obiekt lekcji
	 */
	public void addLessonToList (Lesson lesson){
		lessonList.add(lesson);
	}
	
	/** Metoda ta zwraca liste lekcji
	 * @return lessonList - lista zawierajaca lekcje
	 */
	public ArrayList<Lesson> getLessonList() {
		return lessonList;
	}

	/** Metoda ta ustawia  liste zajec na te podana w parametrze lessonList
	 * @param lessonList - lista z zajeciami
	 */
	public void setLessonList(ArrayList<Lesson> lessonList) {
		this.lessonList = lessonList;
	}
}
