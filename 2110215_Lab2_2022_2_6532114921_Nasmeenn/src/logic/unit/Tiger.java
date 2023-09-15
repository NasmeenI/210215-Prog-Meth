package logic.unit;

public class Tiger extends BaseCompetitor {
	public Tiger(String name) {
		super(name,7,5);
	}
	
	public Tiger(String name, int hp, int power) {
		super(name,hp,power);
	}
	
	public void train(int addPower) {
		if(addPower < 0) return ;
		setPower(this.power + addPower);
	}
	
	public void attack(BaseCompetitor enemy) {
		int damage;
		if(enemy.getType().equals("ToughMan")) {
			damage = this.power/2;
		}
		else if(enemy.getType().equals("Tiger") || enemy.getType().equals("BaseCompetitor")) {
			damage = this.power;
		}
		else {
			damage = this.power * 3 / 2;
		}
		enemy.setHp(enemy.getHp() - damage);
	}
}