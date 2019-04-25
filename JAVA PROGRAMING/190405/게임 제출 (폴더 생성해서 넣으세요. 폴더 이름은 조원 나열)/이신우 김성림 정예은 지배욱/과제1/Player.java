import java.util.Random;

public class Player{
	String name = "";
	int hp = 0;
	int defen = 0;
	int count = 0;
	//생성자
	Player(String name, int hp, int defen){
		this.name = name;
		this.hp = hp;
		this.defen = defen;
	}
	
	public boolean status() {
		if (this.hp > 0) {
			return true;
		}
		return false;
	}
	
	public int getAttackPower() {
		return 10;
	}
	
	public void beUnderattack(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		
		if (hitNumber < 3 || count == 2) {
			this.hp = hp - (attackPower - this.defen);
			System.out.println(this.name + "이(가) " + (attackPower - this.defen) + "의 데미지를 입었습니다.");
			System.out.println(this.name + " 남은체력 : " + this.hp);
			this.count = 0;
			
		} else if (hitNumber > 7) {
			this.hp = hp - attackPower;
			System.out.println("<<<<귀요미 대마왕 시누쨔응의 공격에 당했습니다 ㅠㅅ ㅠ! >>>>");
			System.out.println(this.name + "이(가) " +  attackPower + "의 데미지를 입었습니다.");
			System.out.println(this.name + " 남은체력 : " + this.hp);
			this.count = 0;
			
		} else {
			System.out.println(this.name + "이(가) 공격을 회피했습니다.");
			this.count = this.count + 1;		
		}
	}
}
