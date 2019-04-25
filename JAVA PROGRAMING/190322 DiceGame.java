import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10000000; i++) {
			System.out.println("컴퓨터의 주사위를 굴릴까요? (종료하실려면 q를 입력하세요)");
			String inputString = scan.nextLine();
			if (inputString.equalsIgnoreCase("q")) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			
			comDice = rand.nextInt(6) + 1;
			System.out.println("컴퓨터의 주사위는 " + comDice + "입니다.");

			System.out.println("사용자의 주사위를 굴릴까요?");
			scan.nextLine();
			
			userDice = rand.nextInt(6) + 1;
			System.out.println("사용자의 주사위는 " + userDice + "입니다.");
			
			if (comDice == userDice) {
				System.out.println("비겼습니다.");
			} else if (comDice > userDice) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (comDice < userDice) {
				System.out.println("사용자가 이겼습니다.");
			}
		}
	}
}
