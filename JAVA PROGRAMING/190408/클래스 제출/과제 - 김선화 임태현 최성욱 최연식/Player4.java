import java.util.Random;

public class Player4 extends Player {
	Player4() {
		this.hp = 1000;
		this.name = "OTL";
		System.out.println("야생의 " + this.name + "이 입장했다.");
	}
	public int getAttackPower() {
		return  100000;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber == 1) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
		} else if (hitNumber == 2 ) {
			hp = hp - (attackPower/2);
			System.out.println(this.name + "이(가)" +"블럭으로인해 "+ (attackPower*0.1) + "의 데미지를 입었습니다.");
		}else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
