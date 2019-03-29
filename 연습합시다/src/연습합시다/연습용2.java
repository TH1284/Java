package 연습합시다;

import java.util.Scanner;

public class 연습용2 {
	public static void main(String[] args) {
		연습용 a = new 연습용();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 999999; i++) {
			System.out.println("입금할 금액: ");
			int coin2 = s.nextInt();
			System.out.println("메세지 :");
			s.nextLine();
			String message = s.nextLine();
			a.deposit2(coin2, message);
			if( message.contentEquals("crash")) {
				break;
			}
			
		}
	}
}
