import java.util.Scanner;

public class PigMain {
	public static void main(String[] args) {
		Pigcoin pc = new Pigcoin();
		
		Scanner scan = new Scanner(System.in);
		 for(int i = 0; i < 2; i++) {
			 System.out.println("입금할 금액을 적으세요.");
			 int coin = scan.nextInt();
			 System.out.println("보낼 메세지를 입력하세요.");
			 scan.nextLine();
			 String message = scan.nextLine();
			 pc.deposit(coin, message);
			 if (message.equals("crash")) {
				 break;
			 }
			 
		 }
	}
	
}
