package mvc.controller;

import mvc.model.Uhr;
import mvc.view.UhrView;

/**
 * Controller fuer die Uhr und die Oberflaeche
 * 
 * @author Marcel Waldau
 *
 */
public class UhrController {

	private Uhr model;
	private UhrView view;

	private boolean uhrAn;

	/**
	 * Konstruktor fuer den Controller
	 * 
	 * @param view
	 *            eine UhrView
	 */
	public UhrController(UhrView view) {

		// erstelle die View bzw. definiere diese
		this.view = view;

		// erstelle das Model
		this.model = new Uhr();

		uhrAn = true;

		// Oberserver zum Modell hinzufuegen
		model.addObserver(view);

		// starte neuen Thread und setze jede Sekunde die Uhrzeit neu

		new Thread() {
			/**
			 * loest jede Sekunde die Aktualisierung der Uhrzeit aus
			 */
			@Override
			public void run() {
				try {
					while (true) {

						if (isUhrEnabled())
							updateTime();
						else {
							pauseUhr();
						}
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
				}
			}
		}.start();

	}

	/**
	 * Startet die Uhr
	 * 
	 * anmerkung: wahrscheinlich nicht richtig
	 */
	private void startUhr() {

		System.out.println(Thread.currentThread().getName());
		synchronized (model) {
			model.notifyAll();
		}
	}

	/**
	 * beendet die Uhr
	 * 
	 * @throws InterruptedException
	 */
	private void pauseUhr() throws InterruptedException {
		synchronized (model) {
			model.wait();
		}
	}

	/**
	 * updadet die Uhrzeit
	 */
	private void updateTime() {
		model.updateTime();
	}

	/**
	 * aktiviert die Uhr
	 */
	public void enableUhr() {
		this.uhrAn = true;
		startUhr();
	}

	/**
	 * deaktiviert die Uhr
	 */
	public void disableUhr() {
		this.uhrAn = false;
	}

	/**
	 * gibt zurueck, ob die Uhr aktiviert ist
	 * 
	 * @return true, wenn aktiviert
	 */
	public boolean isUhrEnabled() {
		return uhrAn;
	}

	/**
	 * gibt die Uhr zurueck
	 * 
	 * @return Uhr
	 */
	public Uhr getUhr() {
		return model;
	}

}
