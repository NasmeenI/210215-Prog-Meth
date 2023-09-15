package logic.unit;

public class Sorcerer extends BaseCompetitor {
	public Sorcerer(String name) {
		super(name);
		setHp(4);
		setPower(2);
	}
	
	public Sorcerer(String name, int hp, int power) {
		super(name);
		setHp(hp);
		setPower(power);
	}
	
	public void lowerPower(BaseCompetitor enemy, int powerDown) {
		if(powerDown < 0) return;
		enemy.setPower(enemy.getPower() - powerDown);
	}
	
	public void attack(BaseCompetitor enemy) {
		int damage;
		if(enemy.getType().equals("Tiger")) {
			damage = this.power/2;
		}
		else if(enemy.getType().equals("Sorcerer") || enemy.getType().equals("BaseCompetitor")) {
			damage = this.getPower();
		}
		else {
			damage = this.power * 3 / 2;
		}
		enemy.setHp(enemy.getHp() - damage);
	}
}