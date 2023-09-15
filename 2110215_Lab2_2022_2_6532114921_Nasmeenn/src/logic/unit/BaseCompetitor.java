package logic.unit;

public class BaseCompetitor {
	protected String name;
	protected int power;
	protected int hp;
	
	public BaseCompetitor(String name) {
		setName(name);
		setHp(5);
		setPower(3);
	}
	
	public BaseCompetitor(String name, int hp, int power) {
		setName(name);
		setHp(hp);
		setPower(power);
	}
	
	public void attack(BaseCompetitor enemy) {
		enemy.setHp(enemy.getHp() - power);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public String getType() {
		return this.getClass().getSimpleName();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = Math.max(hp ,0);
	}
	
	public void setPower(int power) {
		this.power = Math.max(power ,1);
	}
}