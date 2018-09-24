package decorator_pattern.wolf;

public class ErkaelteterWolf extends WolfDekorierer {
	
	public ErkaelteterWolf(Wolf wolf) {
		this.wolf = wolf;
	}

	@Override
	public double gesundheitsGrad() {
		return wolf.gesundheitsGrad()-80;
	}

	@Override
	public String getBeschreibung() {
		return wolf.getBeschreibung() + ", erkaeltetet";
	}

	@Override
	public double geschwindigkeit() {
		return wolf.geschwindigkeit() - 30;
	}

	
}
