package decorator_pattern.wolf;

public class SchnellerWolf extends WolfDekorierer {

	public SchnellerWolf(Wolf wolf) {
		this.wolf = wolf;
	}

	@Override
	public double gesundheitsGrad() {
		return wolf.gesundheitsGrad();
	}

	@Override
	public String getBeschreibung() {
		return wolf.getBeschreibung() + ", schnell";
	}

	@Override
	public double geschwindigkeit() {
		return wolf.geschwindigkeit() + 20;
	}
	
}
