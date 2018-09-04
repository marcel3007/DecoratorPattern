package observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class Wetteroberflaeche implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		 System.out.println("Daten: " + arg);

	}

}
