package entity.ingredient;

import entity.base.Cookable;
import entity.base.Ingredient;
import logic.StringUtil;

public class Egg extends Ingredient implements Cookable {
	private int cookedPercentage;
	
	public Egg() {
		super("Egg");
		setCookedPercentage(0);
	}
	
	public void cook() {
		setCookedPercentage(cookedPercentage + 12);
		if(cookedPercentage > 0 && cookedPercentage <= 50) {
			setName("Raw Egg");
			setEdible(false);
		}
		else if(cookedPercentage <= 80) {
			setName("Sunny Side Egg");
			setEdible(true);
		}
		else if(cookedPercentage <= 100) {
			setName("Fried Egg");
			setEdible(true);
		}
		else if(cookedPercentage > 100) {
			setName("Burnt Egg");
			setEdible(false);
		}
	}
	
	public boolean isBurnt() {
		if(cookedPercentage > 100) return true;
		return false;
	}
	
	public String toString() {
		return StringUtil.formatNamePercentage(getName() ,getCookedPercentage());
	}
	
	public int getCookedPercentage() {
		return cookedPercentage;
	}

	public void setCookedPercentage(int cookedPercentage) {
		this.cookedPercentage = cookedPercentage;
	}

}