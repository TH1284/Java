package 연습합시다;

public class 연습용5 {
	private int coin5;
	public void deposit5(int coin5, String message5) {
		this.coin5 = this.coin5 + coin5;
		if (message5.equals("")) {
			System.out.println("땡그랑~");
			
		}else {
			System.out.println(message5);
		}
	}	
	public void crash1() {
		System.out.println("전체코인"+coin5+"출금되었습니다.");
		this.coin5 = 0;
		
	
	}
}
