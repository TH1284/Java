
public class F3 {
	private int coin;
		
	public void deposit1(int coin, String message) {
		this.coin = this.coin + coin;
		if(message.contentEquals("")) {
			System.out.println("딸그랑");
		}else {
			System.out.println(message);
		}
		
		
	}	
	
	
}
