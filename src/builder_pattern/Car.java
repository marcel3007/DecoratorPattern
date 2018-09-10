package builder_pattern;

/**
 * Ein Auto mit einem Builder fuer ein Auto
 * 
 * Quelle:
 * http://www.karllorey.de/informatik-studium/vorlesungen/objektorientiertes-programmieren/entwurfsmuster-builder-in-java-erbauer/
 * 
 * @author Marcel Waldau
 *
 */
public class Car {

	private Builder mBuilder;

	public static enum FuelType {
		GAS, DIESEL, BENZIN
	}

	private Car(Builder builder) {
		mBuilder = builder;
	}

	public int getSpeed() {
		return mBuilder.speed;
	}

	public int getPower() {
		return mBuilder.power;
	}

	public FuelType getFuelType() {
		return mBuilder.fuelType;
	}

	public boolean isWithCdAudio() {
		return mBuilder.withCdAudio;
	}

	public boolean isWithSunroof() {
		return mBuilder.withSunroof;
	}

	public boolean isWithAirConditioning() {
		return mBuilder.withAirConditioning;
	}

	@Override
	public String toString() {
		return "Car [speed=" + mBuilder.speed + ", power=" + mBuilder.power + ", fuelType=" + mBuilder.fuelType
				+ ", withCdAudio="
				+ mBuilder.withCdAudio + ", withSunroof=" + mBuilder.withSunroof + ", withAirConditioning="
				+ mBuilder.withAirConditioning
				+ "]";
	}

	public static class Builder {

		// Muss
		private int speed;
		private int power;
		private FuelType fuelType;

		// Kann mit Standardwerten
		private boolean withCdAudio = true;
		private boolean withSunroof = false;
		private boolean withAirConditioning = true;

		/**
		 *
		 * @param speed
		 *            Hoechstgeschwindigkeit
		 * @param power
		 *            Leistung
		 * @param ft
		 *            Kraftstoffart
		 */
		public Builder(int speed, int power, FuelType ft) {
			this.speed = speed;
			this.power = power;
			this.fuelType = ft;
		}

		public Builder withCdAudio(boolean integrated) {
			this.withCdAudio = integrated;
			return this;
		}

		public Builder withSunroof(boolean integrated) {
			this.withSunroof = integrated;
			return this;
		}

		public Builder withAirConditioning(boolean integrated) {
			this.withAirConditioning = integrated;
			return this;
		}

		/**
		 * erstellt das eigentliche Auto
		 *
		 * @return das erstellte Auto
		 */
		public Car build() {
			return new Car(this);
		}
	}

}
