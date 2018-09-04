package decorator_pattern;

/**
 * Ein konkretes Basisgericht
 * 
 * @author Marcel Waldau
 *
 */
public class Steak implements IGericht {

	@Override
	public double getPreis() {
		return 10;
	}

	@Override
	public void printDescription() {
		System.out.print("Steak mit: ");
	}

}
