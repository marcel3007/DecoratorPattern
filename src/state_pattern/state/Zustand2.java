package state_pattern.state;

public class Zustand2 implements Zustand {
	
	@Override
	public void naechsterZustand(MeinObjekt meinObjekt) {
		
		System.out.println("Zustand 2");
		meinObjekt.setState(new Zustand3());
	}
}
