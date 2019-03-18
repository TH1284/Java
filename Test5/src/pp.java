import java.util.Random;
import java.util.Scanner;

public class pp {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		Random r = new Random();
//		
//		
//		int sum = 0;
//		
//		for(int i = 0; i<101; i++) {
////			System.out.println(i);
////			sum = sum + i;
//			if (i % 2==0) {
//			sum = sum + i;	
//			}
//		}System.out.println(sum);

		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		int sum2 = 0;
		for (int a = 0; a < 101; a++) {
			if (a % 2 == 1) {
				sum2 = sum2 + a;
			}
		}
		System.out.println(sum2);

		Scanner s1 = new Scanner(System.in);
		Random r1 = new Random();

		int computer;
		int user;
		System.out.println("화면에 주사위를 굴릴까요?");
		String enter1 = s1.nextLine();
		System.out.println("굴려주세요");
		user = s1.nextInt();
		System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
		String enter2 = s1.nextLine();
		String enter3 = s1.nextLine();
		computer = r1.nextInt(6) + 1;
		System.out.println(computer);
		if (user > computer) {
			System.out.println("You Win!");
		} else if (user < computer) {
			System.out.println("You Lose!");
		} else if (user == computer) {
			System.out.println("Draw");
		}

//		int u;
//		int c;
//		System.out.println("화면에 주사위를 굴릴까요?");
//		String enter1 = s1.nextLine();
//		u = s1.nextInt();
//		System.out.println("컴퓨터가 쥐사위를 굴립니다. 실행할까요?");
//		String enter2 = s1.nextLine();
//		c = r1.nextInt(6)+1;
//		if (u > c) {
//			System.out.println("W");
//		}else if (u < c) {
//			System.out.println("L");
//		}else if (u == c) {
//			System.out.println("D");
//		}
		
	}
}
