import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		int dice;
		
		Random ran = new Random();
		dice = ran.nextInt(6)+1;
		
		System.out.println("주사위를 굴려주세요.");
		System.out.println("주사위의 값은 : " + dice);
		if(dice == 1) {
			System.out.println("멍멍");
		}
		else if(dice == 2) {
			System.out.println("야옹");
		}
		else if(dice == 3) {
			System.out.println("3");
		}
		else if(dice == 4) {
			System.out.println("4");
		}
		else if(dice == 5) {
			System.out.println("5");
		}
		else if(dice == 6) {
			System.out.println("6");
		}
	}
	
}
