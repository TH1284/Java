import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	Enemy(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() {   // 2147483647
		return 10;
	}	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber < 2) {
			hp = hp - attackPower;
			System.out.println("대마왕 김동준의 인중냄새 공격!!!!!!!");
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
		} else if (hitNumber > 2) {
			hp = hp - (2 * attackPower);
			System.out.println("대마왕 김동준의 정수리냄새 공격!!!!!!!");
			System.out.println(this.name + "이(가) " + (2 * attackPower) + "의 피해를 입었습니다.");
		}else {  
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
