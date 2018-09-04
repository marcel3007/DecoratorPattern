package state_pattern.state;

public class Zustand1 implements Zustand {
	
	@Override
	public void naechsterZustand(MeinObjekt meinObjekt) {
		
		System.out.println("Zustand 1");
		meinObjekt.setState(new Zustand2());
	}
}
