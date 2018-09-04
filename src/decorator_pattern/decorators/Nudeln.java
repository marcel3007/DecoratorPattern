package decorator_pattern.decorators;

import decorator_pattern.IGericht;

/**
 * konkrete Beilage
 * 
 * @author Marcel Waldau
 *
 */
public class Nudeln extends Beilage {

	public Nudeln(IGericht gericht) {
		super(gericht);
	}

	public void printDescription() {
		gericht.printDescription();
		System.out.print("Nudeln, ");
	}

	public double getPreis() {
		return gericht.getPreis() + 4.50;
	}
}
