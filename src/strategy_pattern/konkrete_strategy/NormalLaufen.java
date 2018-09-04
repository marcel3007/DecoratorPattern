package strategy_pattern.konkrete_strategy;

import strategy_pattern.strategy_interface.LaufVerhalten;

public class NormalLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
		System.out.println("Normal laufen.");
	}

}
