package state_pattern.state_freundin;

public class ZustandNeutral implements Zustand {

	@Override
	public void unterhalten(Person person) {
		System.out.println("Zustand Neurtral -> unterhalten():" + " => wir bleiben im Zustand und machen nichts");

	}

	@Override
	public void kussGeben(Person person) {
		person.setZustand(new ZustandFroehlich());
		System.out.println("Zustand Neurtral -> kussGeben():" + " => wir wechseln in den Zustand froehlich");

	}

	@Override
	public void veraergern(Person person) {

		person.setZustand(new ZustandBockig());
		System.out.println("Zustand Neurtral -> veraergern():" + " => wir wechseln in den Zustand bockig");
	}

	@Override
	public String aktuellerZustand() {
		return "Zustand Neutral";
	}
}
