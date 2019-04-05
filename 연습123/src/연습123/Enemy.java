
package 연습123;
import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	int heal = 20;
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
	public int getAttackPower() {
		return 10;
	}	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
		}else if(hitNumber < 5){
			if(hp <= 20) {
				this.hp = hp+heal; 				
				System.out.println(this.name + heal +"이(가)"+"회복합니다." );
			}else {
				System.out.println(this.name + "이(가) 회피했습니다.");
			}
			
			
		}
		else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
