import java.util.Random;

public class Enemy {
	String name = "";
	int Street = 0;
	Enemy(String name) {
		this.name = name;
		this.Street = Street;
	}
	boolean isEnd = false;
	int myRank;
	static int rankCount = 0;
	public boolean status() {
		if (Street > 10) {
			if (isEnd == false) {
				rankCount++;
				this.myRank = rankCount;
				System.out.println(this.name + "완주" + rankCount);
				isEnd = true;
			}
			return false;
		}
		return true;
	}
	
	public void beUnderAttak() {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 1) {
			Street = Street + 1;
			System.out.println(this.name + "이(가) 1만큼 갔습니다. 현재 : " + Street);
		}else if(hitNumber == 2){
			Street = Street + 2;
			System.out.println(this.name + "이(가) 2만큼 갔습니다. 현재 : " + Street);
		}else if(hitNumber == 3){
			Street = Street + 3;
			System.out.println(this.name + "이(가) 3만큼 갔습니다. 현재 : " + Street);
		}else if(hitNumber == 4){
			Street = Street + 4;
			System.out.println(this.name + "이(가) 4만큼 갔습니다. 현재 : " + Street);
		}else {
			Street = Street + 5;
			System.out.println(this.name + "이(가) 5만큼 갔습니다. 현재 : " + Street);
		}
		
	}
	public String toString() {
		
		return this.name;
	}
}
