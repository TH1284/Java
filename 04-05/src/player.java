import java.util.Random;

public class player {
	String name = "";
	int hp = 0;
	player(String name, int hp){
		this.hp = hp;
		this.name = name;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public void beUnderAttak() {
		Random random = new Random();
		int hitNumber = random.nextInt(100);
		if (hitNumber == 99) {
			hp = hp - 10;
			System.out.println(this.name + " 이(가) 10의 데미지를 입었습니다.");
		} else {
			System.out.println(this.name + "가 회피했습니다.");
		}
	}
}
