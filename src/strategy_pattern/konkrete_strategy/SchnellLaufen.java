package strategy_pattern.konkrete_strategy;

import strategy_pattern.strategy_interface.LaufVerhalten;

public class SchnellLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
        System.out.println("Schnell laufen."); 
	}

}
