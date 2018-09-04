package mvc.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import mvc.controller.UhrController;
import mvc.model.Uhr;

import java.util.*;

/**
 * Stellt eine Digitale Uhr dar, die man anhalten und weiterlaufen lassen kann
 *
 */
public class DigitalUhr extends UhrView {

	private static final String TAG = "DigitalUhrView";

	private static final String TITEL = "Digitaluhr";

	private static final String KNOPF_EIN = "Ein";
	private static final String KNOPF_AUS = "Aus";

	private JLabel anzeige;

	// Ein = Einschalten der Anzeige, Aus = Ausschalten der Anzeige
	private JButton[] knoepfe;

	/**
	 * erstellt das Fenster fuer die digitale Uhr und bringt es auf den Bildschirm;
	 * zu Beginn laeuft die Uhr im 1-Sekunden-Takt
	 */
	public DigitalUhr() {

		// Erstellung der Oberflaechenelemente:
		setTitle(TITEL);
		setSize(BREITE, HOEHE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		add(new JLabel(TITEL));

		anzeige = new JLabel();
		add(anzeige);

		
		knoepfe = new JButton[2];
		knoepfe[0] = new JButton(KNOPF_EIN);
		knoepfe[1] = new JButton(KNOPF_AUS);

		for (JButton knopf : knoepfe) {
			super.add(knopf);
		}
		knoepfe[0].setEnabled(false); // "Ein"

		// Erstellen des ActionListeners f�r die beiden Buttons (Ein, Aus):
		ActionListener lauscher = new ActionListener() {
			/**
			 * schaltet je nach gedrueckten Knopf die Uhrzeitanzeige ein (Ein), die
			 * Uhrzeitanzeige aus (Aus)
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch (e.getActionCommand()) {

				// Uhrzeitanzeige anschalten
				case KNOPF_EIN:
					System.out.println(TAG + " EIN presseed");
					controller.enableUhr();
					break;

				// Uhrzeitanzeige ausschalten
				case KNOPF_AUS:
					System.out.println(TAG + " AUS presseed");
					controller.disableUhr();
					break;
				}

				knoepfe[0].setEnabled(!controller.isUhrEnabled());
				knoepfe[1].setEnabled(controller.isUhrEnabled());
			}
		};

		// Zufuegen des ActionListeners zu den Buttons
		for (JButton knopf : knoepfe) {
			knopf.addActionListener(lauscher);
		}

		// Auf den Bildschirm bringen:
		//pack();
		setVisible(true);

	}

	@Override
	public void update(Observable o, Object arg) {
		tick();
	}

	@Override
	protected void tick() {

		System.out.println(TAG + " tick() aufgerufen");

		if (controller.isUhrEnabled()) {
			anzeige.setText(controller.getUhr().toString());
		}
	}

	/**
	 * Digitaluhr anzeigen
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		UhrView view = new DigitalUhr();

		controller = new UhrController(view);

	}
}
