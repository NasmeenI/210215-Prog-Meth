package logic.unit;

public class ToughMan extends BaseCompetitor {
	private int maxHp;
	
	public ToughMan(String name) {
		super(name,8,4);
		this.setMaxHp(8);
	}
	
	public ToughMan(String name, int hp, int power) {
		super(name,hp,power);
		this.setMaxHp(hp);
	}
	
	public void heal(int healHp) {
		if(healHp < 0) return;
		if(this.hp + healHp > this.maxHp) setHp(this.maxHp);
		else setHp(this.hp + healHp);
	}
	
	public void attack(BaseCompetitor enemy) {
		int damage;
		if(enemy.getType().equals("Sorcerer")) {
			damage = this.power/2;
		}
		else if(enemy.getType().equals("ToughMan") || enemy.getType().equals("BaseCompetitor")) {
			damage = this.power;
		}
		else {
			damage = this.power * 3 / 2;
		}
		enemy.setHp(enemy.getHp() - damage);
	}
	
	public void setMaxHp(int maxHp) {
		if(maxHp < 0) {
			maxHp = 0;
		}
		if(maxHp < this.hp) {
			this.hp = maxHp;
		}
		this.maxHp = maxHp;
	}
	
	public int getMaxHp() {
		return this.maxHp;
	}
}