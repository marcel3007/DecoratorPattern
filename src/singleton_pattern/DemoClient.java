package singleton_pattern;

public class DemoClient {

	public static void main(String[] args) {
		
		Bankwerte bankwerte = Bankwerte.getInstance();
	
		System.out.println(String.format("%s: %.2f", "Zinsen", bankwerte.getZinsen()));

	}

}
