package decorator_pattern.decorators;

import decorator_pattern.IGericht;

public class Dessert extends Beilage {

	public Dessert(IGericht gericht) {
		super(gericht);
	}

	@Override
	public double getPreis() {
		
		return gericht.getPreis()+6;
	}

	@Override
	public void printDescription() {
		gericht.printDescription();
		System.out.print("Dessert, ");

	}

}
