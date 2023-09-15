package entity.counter;

import logic.LogicUtil;
import logic.Player;

public class Crate extends Counter {
	private String myIngredient;
	
	public Crate(String s) {
		super(s + " Crate");
		setMyIngredient(s);
	}
	
	public void interact(Player p) {
		if(p.isHandEmpty() == false || this.isPlacedContentEmpty() == false) {
			super.interact(p);
			return;
		}
		
		try {
			p.setHoldingItem(LogicUtil.createIngredientFromName(this.getMyIngredient()));			
		}
		catch(Exception e) {
			p.setHoldingItem(null);
		}
	}

	public String getMyIngredient() {
		return myIngredient;
	}

	public void setMyIngredient(String myIngredient) {
		this.myIngredient = myIngredient;
	}
}