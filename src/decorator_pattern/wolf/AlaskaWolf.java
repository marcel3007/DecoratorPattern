package decorator_pattern.wolf;

public class AlaskaWolf extends Wolf {

	@Override
	public String getBeschreibung() {
		return "AlaskaWolf";
	}

	@Override
	public double gesundheitsGrad() {
		return 100;
	}

	@Override
	public double geschwindigkeit() {
		return 200;
	}

}
