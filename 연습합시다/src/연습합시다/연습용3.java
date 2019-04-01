package 연습합시다;

public class 연습용3 {
	private int coin3;
	public void deposit3(int coin3,String message3) {
		this.coin3 = this.coin3 + coin3;
		if(message3.equals("")) {
			System.out.println("땡땡땡");
			
			}else {
				System.out.println(message3);
		}
		
		
		}
	
	
	public void crash() {
			System.out.println("전체 코인" + coin3 + "이 출금되었습니다");
			this.coin3 = 0;
	}
}
