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
		return 10;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber == 1) {
			attackPower = 0;
			System.out.println("데미지를 입지않지롱 메롱~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("이신우는 잘생겼다.");
		} else if (hitNumber == 2) {
			hp = hp + (attackPower / 2);
			System.out.println("지배욱은 잘생겼다.");
		}
		else if (hitNumber == 3) {
			hp = hp + attackPower;
			System.out.println("정예은은 예쁘다.");
		}
		else if (hitNumber == 4) {
			hp = hp - (attackPower / 4);
			System.out.println("김성림은 잘생겼다.");
		}
		else if (hitNumber == 5) {
			hp = 1;
			System.out.println("조영철은 잘생겼다.");
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
