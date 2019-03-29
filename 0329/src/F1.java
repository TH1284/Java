
public class F1 {
	public int totalCoin = 0;
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(int inputCoin) {
		this.totalCoin = totalCoin + inputCoin;
}

	public void withdraw() {
		System.out.println("출금액: " + totalCoin);
		totalCoin = 0;
	}
}
