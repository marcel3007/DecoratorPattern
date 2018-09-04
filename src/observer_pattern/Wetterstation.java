package observer_pattern;

public class Wetterstation {

	public static void main(String[] args) {
		
		Wetterdaten subjekt = new Wetterdaten();
		Wetteroberflaeche beobachter = new Wetteroberflaeche();
		Wetteroberflaeche beobachter2 = new Wetteroberflaeche();
		
		subjekt.addObserver(beobachter);
		subjekt.addObserver(beobachter2);
		
		
		subjekt.setMesswerte(20);
		
	}

}
