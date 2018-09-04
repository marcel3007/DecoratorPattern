package strategy_pattern.konkrete_strategy;

import strategy_pattern.strategy_interface.BellVerhalten;

public class LeiseBellen implements BellVerhalten {

	@Override
	public void bellen() {
        System.out.println("ganz leise bellen ...");
	}

}
