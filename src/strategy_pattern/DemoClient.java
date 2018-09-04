package strategy_pattern;

import strategy_pattern.context.Husky;
import strategy_pattern.konkrete_strategy.Humpeln;

public class DemoClient {

	public static void main(String[] args) {

		Husky husky = new Husky();
		husky.bellen(); // ganz leises bellen...
		husky.laufen(); // Schnelles laufen
		husky.setLaufVerhalten(new Humpeln());
		husky.laufen(); // Humpeln

	}

}
