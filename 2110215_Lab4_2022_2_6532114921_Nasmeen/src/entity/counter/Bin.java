package entity.counter;

import entity.base.Container;
import entity.base.Ingredient;
import entity.base.Item;
import logic.Player;

public class Bin extends Counter {
	public Bin() {
		super("Bin");
	}
	
	public void interact(Player p) {
		if(p.isHandEmpty()) return;
		
		Item item = p.getHoldingItem();
		if(item instanceof Ingredient) p.setHoldingItem(null);
		else if(item instanceof Container) ((Container) item).clearContent();
	}
}