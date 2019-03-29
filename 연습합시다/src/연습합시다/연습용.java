package 연습합시다;

public class 연습용 {
	private int coin2;
	public void deposit2(int coin2, String message) {
		this.coin2 = this.coin2 + coin2;
		if(message.equals("")) {
			System.out.println("땡그랑");
		}else {
			System.out.println(message);
		}
	}
}
