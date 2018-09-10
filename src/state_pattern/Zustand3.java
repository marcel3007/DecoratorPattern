package state_pattern;

public class Zustand3 implements Zustand {

	@Override
	public void naechsterZustand(MeinObjekt meinObjekt) {
		
		System.out.println("Letzter Zustand");
		meinObjekt.setState(new Zustand1());
	}

}
