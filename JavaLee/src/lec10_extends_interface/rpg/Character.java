package lec10_extends_interface.rpg;

public abstract class Character {
	private String name;
	private int damage;
	private int hp;
	
	public Battle battle;
	
	public Character(String name, int demage, int hp) {
		super();
		this.name = name;
		this.damage = demage;
		this.hp = hp;
	}
	
	
	
	// 공격
	public void attack(Enemy enemy) {
		enemy.setHp(enemy.getHp() - this.damage);
		this.hp -= enemy.getDamage();
		
		if(enemy.getHp() <= 0) {
			enemy.die();
		}
		
		if(this.hp <= 0) {
			die();
		}
	}
	
	// 죽음
	public void die() {
		System.out.println(this.name + "이(가) 사망하였습니다.");
		battle.outOfBattle();
	}
	
	// 스킬
	public abstract void skill(Enemy enemy);
	
	@Override
	public String toString() {
		return "Character [name=" + name + ", demage=" + damage + ", hp=" + hp + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDemage() {
		return damage;
	}
	public void setDemage(int demage) {
		this.damage = demage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
}
