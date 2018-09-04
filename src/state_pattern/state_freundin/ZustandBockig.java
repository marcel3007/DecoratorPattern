package state_pattern.state_freundin;

public class ZustandBockig implements Zustand {


	@Override
	public void unterhalten(Person person) {
		System.out.println("Zustand Bockig -> unterhalten():" + " => wir bleiben im Zustand und machen nichts");

	}

	@Override
	public void kussGeben(Person person) {
		person.setZustand(new ZustandNeutral());
		System.out.println("Zustand Bockig -> kussGeben():" + " => wir wechseln in den Zustand neutral");
	}

	@Override
	public void veraergern(Person person) {
		System.out.println("Zustand Bockig -> veraergern():" + " => wir bleiben im Zustand und machen nichts");
	}

	@Override
	public String aktuellerZustand() {
		return "Zustand Bockig";
	}
}
