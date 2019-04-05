package 연습123;
import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	Player(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() {
		return  40;
	}
	public void beUnderAttak(int getAttackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber == 1) {
			hp = hp - getAttackPower;
			System.out.println(this.name + "이(가) " + getAttackPower + "의 데미지를 입었습니다.");
		} else if (hitNumber == 2 ) {
			hp = hp - (getAttackPower/2);
			System.out.println(this.name + "이(가)" +"블럭으로인해 "+ (getAttackPower/2) + "의 데미지를 입었습니다.");
		}else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
