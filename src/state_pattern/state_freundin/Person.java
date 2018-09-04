package state_pattern.state_freundin;

public class Person {

	private Zustand zustand;
	
	
	public Person() {
		zustand = new ZustandFroehlich();
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.run();
	}

	public void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}

	public Zustand getZustand() {
		return zustand;
	}
	
	
	public void run() {
		zustand.kussGeben(this);
		System.out.println(zustand.aktuellerZustand());
		
		zustand.kussGeben(this);
		zustand.kussGeben(this);
		zustand.kussGeben(this);
		
		zustand.unterhalten(this);
		
		zustand.veraergern(this);

		zustand.veraergern(this);
		
		zustand.kussGeben(this);

		zustand.kussGeben(this);
	}
}
