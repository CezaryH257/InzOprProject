package iCal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import biweekly.Biweekly;
import biweekly.ICalendar;
import biweekly.component.VEvent;

/**
 * Klasa tworzy liste i zamienia z VLesson na VEvent wszystkie wydarzenia i
 * eksportuje do iCal
 * 
 * @author Robert Piêkny
 *
 */
public class Exporter {
	private ICalendar iCalendar;
	private ArrayList<VEvent> events;
	private ArrayList<VLesson> vlessons;

	/** Konstruktor tworzy obiekt ICalendar i nowa liste. Tworzy nowe wydarzenie i wypelnia kalendarz
	 * @param vlessons - kolekcja typy ArrayList
	 */
	public Exporter(ArrayList<VLesson> vlessons) {
		iCalendar = new ICalendar();
		events = new ArrayList<VEvent>();
		this.vlessons = vlessons;
		createEvents();
		fillICalendar();
	}

	/** Metoda dodaje wydarzenia do listy.
	 * Tworzy obiekt typu VEvent. Ustawia date, czas trwania, nazwe oraz opis i
	 * dodaje wydarzenie do listy.
	 */
	private void createEvents() {
		for (int i = 0; i < vlessons.size(); i++) {
			for (int j = 0; j < vlessons.get(i).getDatesAmount(); j++) {
				VEvent vEvent = new VEventBuilder()
				.setDate(vlessons.get(i).getDateByIndex(j))
				.setDuration(vlessons.get(i).getDuration())
				.setSummary(vlessons.get(i).getDescription())
				.setDescription("opis")
				.build();
				events.add(vEvent);
			}
		}
	}

	/** Metoda wype³nia kalendarz wydarzeniami
	 */
	private void fillICalendar(){
		for (int i = 0; i < events.size(); i++) {
			iCalendar.addEvent(events.get(i));
		}
	}
	
	/** Metoda exportuje kalendarz do pliku
	 * Metoda tworzy obietkt typy File, który przechowuje nazwe pod ktora zostanie wyeksportowany plik
	 * @param fileName - obiekt typu String
	 */
	public void exportEvents(String fileName) {
		File file = new File(fileName);
		try {
			Biweekly.write(iCalendar).go(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
