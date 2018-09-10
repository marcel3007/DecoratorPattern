package decorator_pattern;

import decorator_pattern.decorators.Bratkartoffeln;
import decorator_pattern.decorators.Dessert;
import decorator_pattern.decorators.Nudeln;
import decorator_pattern.decorators.Salat;

/**
 * Ein DemoClient fuer das Decorator Design Pattern
 * 
 * Gegeben sei folgendes Szenario: Ein Restaurant möchte seine beiden
 * beliebtesten Gerichte "Wiener Schnitzel mit Pommes" und "Wiener Schnitzel mit
 * Bratkartoffeln" modellieren. Der Preis und die Beschreibung sollen via
 * Methoden abgefragt werden (Beispiel in Anlehnung an [VKBF], Seite 80ff.).
 * 
 * Quelle: https://www.philipphauer.de/study/se/design-pattern/decorator.php
 * 
 * @author Marcel
 *
 */
public class DemoClient {

	public static void main(String[] args) {

		IGericht gericht = new Salat(new Nudeln(new Steak()));
		gericht.printDescription();
		System.out.println("Preis: " + gericht.getPreis());

		System.out.println();

		IGericht gericht2 = new Salat(new Nudeln(new WienerSchnitzel()));
		gericht2.printDescription();
		System.out.println("Preis: " + gericht2.getPreis());

		System.out.println();

		IGericht gericht3 = new Dessert(new Salat(new Bratkartoffeln(new WienerSchnitzel())));
		gericht3.printDescription();
		System.out.println("Preis: " + gericht3.getPreis());
		

	}

}
