package decorator_pattern.decorators;

import decorator_pattern.IGericht;

/**
 * abstrakte Beilage
 * 
 * @author Marcel Waldau
 *
 */
public abstract class Beilage implements IGericht {

	protected IGericht gericht;

	public Beilage(IGericht gericht) {
		this.gericht = gericht;
	}

	

}
