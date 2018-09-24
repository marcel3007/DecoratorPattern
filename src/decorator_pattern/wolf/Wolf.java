package decorator_pattern.wolf;

public abstract class Wolf {
	
	String beschreibung = "Unbekannter Wolf";
	double gesundheitsgrad;
	double geschwindigkeit;
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public abstract double gesundheitsGrad();

	public abstract double geschwindigkeit();


	
	
	
}
