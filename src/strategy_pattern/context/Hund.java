package strategy_pattern.context;

import strategy_pattern.konkrete_strategy.LautBellen;
import strategy_pattern.konkrete_strategy.SchnellLaufen;
import strategy_pattern.strategy_interface.BellVerhalten;
import strategy_pattern.strategy_interface.LaufVerhalten;

public abstract class Hund {
	
	//Instanzvariablen vom Typ des Interfaces. Defaultverhalten 
    BellVerhalten bellVerhalten = new LautBellen(); 
    LaufVerhalten laufVerhalten = new SchnellLaufen(); 
    
	public void setBellVerhalten(BellVerhalten bellVerhalten) {
		this.bellVerhalten = bellVerhalten;
	}

	public void setLaufVerhalten(LaufVerhalten laufVerhalten) {
		this.laufVerhalten = laufVerhalten;
	}

	public void bellen() {
		// Delegation des Verhaltens an Verhaltensobjekt
		bellVerhalten.bellen();
	}

	public void laufen() {
		// Delegation des Verhaltens an Verhaltensobjekt
		laufVerhalten.laufen();
	}

}
