package decorator_pattern;

/**
 * Ein konkretes Basisgericht
 * 
 * @author Marcel Waldau
 *
 */
public class WienerSchnitzel implements IGericht {

	@Override
	public double getPreis() {
		return 8;
	}

	@Override
	public void printDescription() {
		System.out.print("Wiener Schnitzel mit: ");
	}

}
