package decorator_pattern.decorators;

import decorator_pattern.IGericht;

/**
 * konkrete Beilage
 * 
 * @author Marcel Waldau
 *
 */
public class Bratkartoffeln extends Beilage {

	public Bratkartoffeln(IGericht gericht) {
		super(gericht);
	}

	public void printDescription() {
		gericht.printDescription();
		System.out.print("Bratkartoffeln, ");
	}

	public double getPreis() {
		return gericht.getPreis() + 5.50;
	}
}
