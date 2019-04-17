import java.util.Random;
import java.util.Scanner;

public class Dice2 {
	public static void main(String[] args) {
		int player;
		int computer;
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("화면에 주사위를 굴릴까요?");
		String enter1 = scan.nextLine();
		player = ran.nextInt(6)+1;
		System.out.println(player);
		System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
		String enter2 = scan.nextLine();
		computer = ran.nextInt(6)+1;
		System.out.println(computer);
		if(player > computer) {
			System.out.println("You Win!");
		}
		else if(player == computer) {
			System.out.println("Draw");
		}
		else if(player < computer) {
			System.out.println("You Lose");
		}
	}
}
