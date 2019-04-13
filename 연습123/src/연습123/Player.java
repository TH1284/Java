package 연습123;
import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	Player(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
// 오류
//	public void status() {
//		if (hp > 0) {
//		 System.out.println("살음");
//		}else {
//			System.out.println("죽음");
//		}
		
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	
	
	public int getAttackPower() {
		return  40;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		int getAttackPower1 = 40;
		if (hitNumber == 1) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
		} else if (hitNumber == 2 ) {
			hp = hp - (attackPower/2);
			System.out.println(this.name + "이(가)" +"블럭으로인해 "+ (attackPower/2) + "의 데미지를 입었습니다.");
		}else if (hitNumber == 3) {
			getAttackPower1 = getAttackPower1 * 2;
			System.out.println(this.name + "이(가)" + "버프를 받아" + "공격력이 2배로 증가하였습니다.");
		}else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
