package decorator_pattern.decorators;

import decorator_pattern.IGericht;

/**
 * konkrete Beilage
 * 
 * @author Marcel Waldau
 *
 */
public class Pommes extends Beilage {

	public Pommes(IGericht gericht) {
		super(gericht);
	}

	public void printDescription() {
		gericht.printDescription();
		System.out.print("Pommes, ");
	}

	public double getPreis() {
		return gericht.getPreis() + 2.50;
	}
}
