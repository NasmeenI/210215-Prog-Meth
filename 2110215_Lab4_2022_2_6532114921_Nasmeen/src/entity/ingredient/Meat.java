package entity.ingredient;

import entity.base.Choppable;
import entity.base.Cookable;
import entity.base.Ingredient;
import logic.StringUtil;

public class Meat extends Ingredient implements Choppable,Cookable {
	private boolean chopState;
	private int cookedPercentage;
	
	public Meat() {
		super("Meat");
		setChopState(false);
		setCookedPercentage(0);
	}
	
	public void chop() {
		if(getChopState() || getCookedPercentage() > 0) {
			return ;
		}
		setChopState(true);
		setName("Minced Meat");
	}
	
	public boolean isChopped() {
		return chopState;
	}
	
	public void cook() {
		if(!getChopState()) {
			setCookedPercentage(cookedPercentage + 10);
			
			if(cookedPercentage > 0 && cookedPercentage <= 50) {
				setName("Raw Meat");
				setEdible(false);
			}
			else if(cookedPercentage <= 80) {
				setName("Medium Rare Steak");
				setEdible(true);
			}
			else if(cookedPercentage <= 100) {
				setName("Well Done Steak");
				setEdible(true);
			}
			else if(cookedPercentage > 100) {
				setName("Burnt Steak");
				setEdible(false);
			}
		}
		else {
			setCookedPercentage(cookedPercentage + 15);
			
			if(cookedPercentage > 0 && cookedPercentage <= 80) {
				setName("Raw Burger");
				setEdible(false);
			}
			else if(cookedPercentage <= 100) {
				setName("Cooked Burger");
				setEdible(true);
			}
			else if(cookedPercentage > 100) {
				setName("Burnt Burger");
				setEdible(false);
			}
		}
	}
	
	public boolean isBurnt() {
		if(getCookedPercentage() > 100) return true;
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

	public boolean getChopState() {
		return chopState;
	}
	
	public void setChopState(boolean chopState) {
		this.chopState = chopState;
	}

}
