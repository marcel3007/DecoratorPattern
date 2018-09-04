package mvc.view;

import java.util.Observer;

import javax.swing.JFrame;

import mvc.controller.UhrController;
import mvc.model.Uhr;

/**
 * abstrakte Klasse fuer eine UhrView
 * 
 * @author Marcel Waldau
 *
 */
public abstract class UhrView extends JFrame implements Observer {

	protected static final long serialVersionUID = 1L;

	protected static UhrController controller;

	protected static final int BREITE = 400;
	protected static final int HOEHE = 300;

	/**
	 * Holen der aktuellen Uhrzeit und Anzeige, wenn die Uhr angestellt ist
	 */
	protected abstract void tick();

}
