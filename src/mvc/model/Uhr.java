package mvc.model;

import java.time.LocalTime;
import java.util.Observable;

/**
* eine Uhr mit Sekundenzaaehlung
*/
public class Uhr extends Observable 
{
	private int stunde, minute, sekunde;     
	
    public int getStunde() { return stunde; }

    public int getMinute() { return minute; }

    public int getSekunde() { return sekunde; }  
	
	public void updateTime() {
		
		// setze die neue Uhrzeit
		LocalTime jetzt = LocalTime.now();
		stunde = jetzt.getHour();
		minute = jetzt.getMinute();
		sekunde = jetzt.getSecond();
		
		// benachrichtige alle Observer
		setChanged();
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", getStunde(), getMinute(), getSekunde());
	}




}
