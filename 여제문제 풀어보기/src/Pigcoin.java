
public class Pigcoin {
	int coin = 0;
	
	public void deposit(int coin, String message) {
		this.coin  = this.coin + coin;
		
		if(message.contentEquals("")) {
			System.out.println("땡그랑");
		}
		else {
			System.out.println(message);
		}
	}
	
	
}
