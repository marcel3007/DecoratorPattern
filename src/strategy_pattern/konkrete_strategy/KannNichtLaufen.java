package strategy_pattern.konkrete_strategy;

import strategy_pattern.strategy_interface.LaufVerhalten;

public class KannNichtLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
        System.out.println("Kann nicht laufen."); 
	}

}
