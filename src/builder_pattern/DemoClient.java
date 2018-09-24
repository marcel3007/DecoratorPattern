package builder_pattern;

/**
 * Demo Client zur Demonstration des Auto Builders Es werden 2 verschiedene
 * Autos erstellt.
 * 
 * @author Marcel Waldau
 *
 */
public class DemoClient {

	public static void main(String[] args) {

		Car audiA3 = new Car.Builder(200, 180, Car.FuelType.DIESEL)
				.withAirConditioning(true)
				.withCdAudio(true)
				.withSunroof(false)
				.build();

		Car bmwM3 = new Car.Builder(249, 420, Car.FuelType.GAS)
				.withAirConditioning(true)
				.withCdAudio(true)
				.withSunroof(true)
				.build();

		System.out.println("Audi A3 " + audiA3.toString());
		System.out.println("BMW M3 " + bmwM3.toString());
	}

}
