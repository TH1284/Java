import java.util.Random;
import java.util.Scanner;

public class UvsC {
	public static void main(String[] args) {
		int user;
		int computer;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("화면에 주사위를 굴릴까요?");
		String Enter1 = s.nextLine(); 
		user = s.nextInt();
		System.out.println(user);
		System.out.println("컴퓨터가 주사위를 글립니다. 실행할까요?");
		String Enter2 = s.nextLine();
		computer = r.nextInt(6)+1;
		System.out.println(computer);
		if(user > computer) {
			System.out.println("You Win!");
		}else if(user < computer) {
			System.out.println("You Lose!");
		}else {
			System.out.println("Draw");
		}
	}
}
