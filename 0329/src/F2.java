
public class F2 {
	public static void main(String[] args) {
		F1 box1 = new F1();
		F1 box2 = new F1();
		
		box1.setName("돼지저금통");
		box2.setName("서랍형");
		
		box1.withdraw();
		box2.withdraw();
		
		System.out.println(box1.totalCoin);
		System.out.println(box2.totalCoin);
	}
}
