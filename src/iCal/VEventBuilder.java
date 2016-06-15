package iCal;

import java.util.Date;

import biweekly.component.VEvent;
import biweekly.util.Duration;

/**
 * Klasa oparta o wzorzec obiektowy typu Builder wykorzystywana jest do
 * tworzenia i ustawiania wszystkich parametrow VEvent
 * 
 * @author Robert Piêkny
 */
public class VEventBuilder {
	private VEvent vEvent;

	/**
	 * Metoda tworzy obiekty typu vEvent
	 */
	public VEventBuilder() {
		vEvent = new VEvent();
	}

	/**
	 * Metoda ustawia nazwe wydarzenia
	 * 
	 * @param summary
	 *            - obiekt typu String zawierajacy nazwe
	 * @return Zwraca obiekt VEventBuildera
	 */
	public VEventBuilder setSummary(String summary) {
		vEvent.setSummary(summary);
		return this;
	}

	/**
	 * Metoda ustawia opis wydarzenia
	 * 
	 * @param description
	 *            - obiekt typu string zawierajacy opis
	 * @return Zwraca obiekt VEventBuildera
	 */
	public VEventBuilder setDescription(String description) {
		vEvent.setDescription(description);
		return this;
	}

	/**
	 * Metoda ustawia czas rozpoczêcia wydarzenia
	 * 
	 * @param date
	 *            - obiekt typu Date zawierajacy date
	 * @return Zwraca obiekt VEventBuildera
	 */
	public VEventBuilder setDate(Date date) {
		vEvent.setDateStart(date);
		return this;
	}

	/**
	 * Metoda ustawia czas trwania wydarzenia
	 * 
	 * @param minutes
	 *            - obiekt typu int zawierajacy minuty
	 * @return Zwraca obiekt VEventBuildera
	 */
	public VEventBuilder setDuration(int minutes) {
		vEvent.setDuration(new Duration.Builder().minutes(minutes).build());
		return this;
	}

	/**
	 * Metoda zwraca vEvent, ktory zawiera ustawienia parametrow
	 * 
	 * @return
	 */
	public VEvent build() {
		return vEvent;
	}
}
