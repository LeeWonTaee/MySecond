package lec10_extends_interface.rpg;

public class Magician extends Character{
	// Magician 을 만들어주세요
	// Character를 상속받고, attack해도 Character과 같음
	// enum 클래스로 FIRE, ICE를 가지는 필드변수 job 똑같이 생성
	private Jobs job;
	
	public Magician(String name, int demage, int hp, Jobs job) {
		super(name, demage, hp);
		this.job = job;
	}
	
//	public void attack(Enemy enemy) {
//		enemy.setHp(enemy.getHp() - super.getDemage());
//		super.setHp(super.getHp() - enemy.getDamage());
//		if(enemy.getHp() <= 0) {
//			enemy.die();
//		}
//		
//		if(getHp() <=0) {
//			die();
//		}
//	}
	@Override
	public void skill(Enemy enemy) {
		switch(job) {
		case FIRE:
			System.out.println("메테오");
			enemy.setHp(enemy.getHp() - 300);
			
			if(enemy.getHp() <= 0) {
				enemy.die();
			}
			break;
		case ICE:
			System.out.println("얼음화살");
			enemy.setHp(enemy.getHp() - 200);
			
			if(enemy.getHp() <= 0) {
				enemy.die();
			}
			break;
		default:
			System.out.println("직업이 없습니다.");
			break;
		}
	}
	
	enum Jobs{
		FIRE,
		ICE
	}
	
}
