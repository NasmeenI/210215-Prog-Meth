package entity.container;

import entity.base.Container;
import entity.base.Cookable;
import entity.base.Ingredient;

public class Pan extends Container {
	
	public Pan() {
		super("Pan" ,1);
	}
	
	public boolean verifyContent(Ingredient i) {
		return i instanceof Cookable;
	}
	
	public void cook() {
		if(this.isEmpty() == true) return;
		
		for(Ingredient ingredient : this.getContent()) {
			if(this.verifyContent(ingredient) == true) {
				((Cookable) ingredient).cook();
			}
		}
	}
}