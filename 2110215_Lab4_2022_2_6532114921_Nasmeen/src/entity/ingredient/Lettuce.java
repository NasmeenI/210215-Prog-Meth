package entity.ingredient;

import entity.base.Choppable;
import entity.base.Ingredient;

public class Lettuce extends Ingredient implements Choppable {
	private boolean chopState;
	
	public Lettuce() {
		super("Lettuce");
		setEdible(true);
		setChopState(false);
	}
	
	public void chop() {
		if(!chopState) {
			chopState = true;
			setName("Chopped Lettuce");
		}
	}
	
	public boolean isChopped() {
		return chopState;
	}

	public boolean isChopState() {
		return chopState;
	}

	public void setChopState(boolean chopState) {
		this.chopState = chopState;
	}
}
