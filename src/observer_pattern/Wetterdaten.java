package observer_pattern;

import java.util.Observable;

public class Wetterdaten extends Observable {
	
	public void setMesswerte(int temp) {
		this.setChanged();
		this.notifyObservers("Temp: " + temp);
	}
}
