package singleton_pattern;

public class Bankwerte {

	private static Bankwerte bankwerte;
	
	private double zinsen = 1.5;
	
	private Bankwerte() {
		
	}
	
	public static Bankwerte getInstance() {
		if(bankwerte == null)
			bankwerte = new Bankwerte();
		
		return bankwerte;
	}
	
	
	public double getZinsen() {
		return zinsen;
	}
}
