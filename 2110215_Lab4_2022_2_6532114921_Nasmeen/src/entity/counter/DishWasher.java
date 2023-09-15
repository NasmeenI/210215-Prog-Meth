package entity.counter;

import entity.container.Dish;
import logic.Player;

public class DishWasher extends Counter {
	public DishWasher() {
		super("Dish Washer");
	}
	
	public void interact(Player p) {
		if(!isPlacedContentEmpty()) {
			super.interact(p);
		}
		else if(p.getHoldingItem() instanceof Dish && ((Dish) p.getHoldingItem()).isDirty()) {
			super.interact(p);
		}
	}
	
	public void update() {
		if(this.getPlacedContent() instanceof Dish) {
			((Dish) this.getPlacedContent()).clean(15);
		}
	}
}