package decorator_pattern.wolf;

public class DemoWolf {

	public static void main(String[] args) {
		

		Wolf w = new AlaskaWolf();
		
		System.out.println("Wolf Beschreibung: " + w.getBeschreibung());
		System.out.println("Wolf GesundheitsGrad: " + w.gesundheitsGrad());
		System.out.println("Wolf Geschwindigkeit: " + w.geschwindigkeit());

		System.out.println();
		
		w = new ErkaelteterWolf(new AlaskaWolf());

		System.out.println("Wolf Beschreibung: " + w.getBeschreibung());
		System.out.println("Wolf GesundheitsGrad: " + w.gesundheitsGrad());
		System.out.println("Wolf Geschwindigkeit: " + w.geschwindigkeit());

		System.out.println();
		
		w = new SchnellerWolf(new AlaskaWolf());
		
		System.out.println("Wolf Beschreibung: " + w.getBeschreibung());
		System.out.println("Wolf GesundheitsGrad: " + w.gesundheitsGrad());
		System.out.println("Wolf Geschwindigkeit: " + w.geschwindigkeit());
		

		System.out.println();
		
		w = new SchnellerWolf(new ErkaelteterWolf(new AlaskaWolf()));
		
		System.out.println("Wolf Beschreibung: " + w.getBeschreibung());
		System.out.println("Wolf GesundheitsGrad: " + w.gesundheitsGrad());
		System.out.println("Wolf Geschwindigkeit: " + w.geschwindigkeit());
		

		System.out.println();
		
		w = new ErkaelteterWolf(new SchnellerWolf(new AlaskaWolf()));
		
		System.out.println("Wolf Beschreibung: " + w.getBeschreibung());
		System.out.println("Wolf GesundheitsGrad: " + w.gesundheitsGrad());
		System.out.println("Wolf Geschwindigkeit: " + w.geschwindigkeit());

		System.out.println();
		
		w = new SchnellerWolf(new SchnellerWolf(new AlaskaWolf()));
		
		System.out.println("Wolf Beschreibung: " + w.getBeschreibung());
		System.out.println("Wolf GesundheitsGrad: " + w.gesundheitsGrad());
		System.out.println("Wolf Geschwindigkeit: " + w.geschwindigkeit());
	}

}
