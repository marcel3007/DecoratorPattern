package state_pattern.state_freundin;

public class ZustandFroehlich implements Zustand {

	@Override
	public void unterhalten(Person person) {
		System.out.println("Zustand Froehlich -> unterhalten():" + " => wir bleiben im Zustand und machen nichts");

	}

	@Override
	public void kussGeben(Person person) {
		System.out.println("Zustand Froehlich -> kussGeben():" + " => wir bleiben im Zustand und machen nichts");
	}

	@Override
	public void veraergern(Person person) {
		person.setZustand(new ZustandBockig());
		System.out.println("Zustand Froehlich -> veraergern():" + " => wir wechseln in den Zustand bockig");
	}

	@Override
	public String aktuellerZustand() {
		return "Zustand Froehlich";
	}
}
