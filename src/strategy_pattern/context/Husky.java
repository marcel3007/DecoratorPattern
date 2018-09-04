package strategy_pattern.context;

import strategy_pattern.konkrete_strategy.LeiseBellen;
import strategy_pattern.konkrete_strategy.SchnellLaufen;

public class Husky extends Hund {

	public Husky() {
		setBellVerhalten(new LeiseBellen());
		setLaufVerhalten(new SchnellLaufen());
	}
}
