package lec10_extends_interface.starcraft;

public class SiegeTank extends StarUnit{
	// StarUnit을 상속받는 SiegeTank 클래스를 만들어주세요
	// SiegeTank는 siegeMode라는 메소드를 가지고 있고,
	// siegeMode를 실행하면 damage가 70이되고,
	// 공격 사거리가 12로 됩니다.
	public SiegeTank() {
		super("시즈탱크", 35, 120, 7, 2.0, 150, 100);
	}
	
	public void siegeMode() {
		System.out.println("시즈모드");
		super.setDamage(70);
		super.setAttackRange(12);
//		super.setAttackRange(super.getAttackRange() + 5);
	}

	@Override
	public String toString() {
//		return "SiegeTank [ name" + super.getName() + "damege" + super.getDamage()
//				+ "hp" + super.getHp() + "attackRange" + super.getAttackRange() 
//				+ "attackSpeed" + super.getAttackSpeed() + "mineral" + super.getMineral() 
//				+ "gas" + super.getGas() + "]";
		return "SiegeTank " + super.toString();
	}
	
	
	
}
