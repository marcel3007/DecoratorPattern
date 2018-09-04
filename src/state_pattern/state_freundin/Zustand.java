package state_pattern.state_freundin;

public interface Zustand {

	String aktuellerZustand();
	void unterhalten(Person person);
	void kussGeben(Person person);
	void veraergern(Person person);
	
	
}
