package entity.container;

import entity.base.Container;
import entity.base.Ingredient;
import logic.StringUtil;

public class Dish extends Container {
	private int dirty;
	
	public Dish() {
		super("Dish" ,4);
		setDirty(0);
	}
	
	public Dish(int dirty) {
		super("Dish" ,4);
		setDirty(dirty);
	}
	
	public boolean isDirty() {
		if(getDirty() > 0) return true;
		return false;
	}
	
	public boolean verifyContent(Ingredient i) {
		if(!isDirty() && i.isEdible()) return true;
		return false;
	}
	
	public void setDirty(int dirty) {
		if(dirty <= 0) {
			this.dirty = 0;
			setName("Dish");
		}
		else {
			setName("Dirty Dish");
			this.dirty = dirty;
		}
	}
		
	public int getDirty() {
		return dirty;
	}

	public void clean(int amount) {
		setDirty(getDirty() - amount);
	}

	public String toString() {
		if(dirty > 0) return StringUtil.formatNamePercentage(getName() ,getDirty());
		return super.toString();
		
	}
}