package state_pattern.state;



public class MeinObjekt {

	private Zustand zustand;
	
	public MeinObjekt() {
		zustand = new Zustand1();
	}
	
	public static void main(String[] args) {
		MeinObjekt meinObjekt = new MeinObjekt();
		meinObjekt.run();
	}
	
	
	public void setState(Zustand zustand) {
		this.zustand = zustand;
	}
	
	/**
	 * gibt Status zurueck (fuer JUnit Test notwendig)
	 */
	public Zustand getState() {
		return zustand;
	}
	
	public void run() {
		zustand.naechsterZustand(this);
		zustand.naechsterZustand(this);
		zustand.naechsterZustand(this);
		zustand.naechsterZustand(this);
	}
}
