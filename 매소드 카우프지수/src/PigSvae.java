import java.util.Scanner;

public class PigSvae {
	int coin = 0;
	
	Scanner s = new Scanner(System.in);
	
	public void deposit(int coin, String message) {
		this.coin = this.coin + coin;
		
		if(message == "") {
			System.out.println("땡그랑");
		}else {
			System.out.println(message);
		}
	}
	
	public void withdraw() {
		for(int i=0; i<2; i++) {
			System.out.println("입급할 금액을 적어주세요.");
			int coin = s.nextInt();
			System.out.println("메세지를 입력해 주세요.");
			s.nextLine();
			String message = s.nextLine();
			deposit(coin, message);
			if(message.equals("crash")) {
				break;
			}
		}
	}
}
