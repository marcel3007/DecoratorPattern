package decorator_pattern.decorators;

import decorator_pattern.IGericht;

/**
 * konkrete Beilage
 * 
 * @author Marcel Waldau
 *
 */
public class Salat extends Beilage {

	public Salat(IGericht gericht) {
		super(gericht);
	}

	public void printDescription() {
		gericht.printDescription();
		System.out.print("Salat, ");
	}

	public double getPreis() {
		return gericht.getPreis() + 3.50;
	}

}
