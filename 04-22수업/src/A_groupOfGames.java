import java.util.Scanner;

public class A_groupOfGames {
	int dan;
	public void inputDan() throws Exception{
		Scanner s = new Scanner(System.in);
		
		System.out.println("원하는 단을 입력해 주세요.");
		String inputText = s.nextLine();
		this.dan = Integer.parseInt(inputText);
		this.printResult();
		
	}
	public void printResult() {
		for( int i=0; i<9; i++) {
			int number = i+1;
			System.out.println(this.dan + " x " + number + " = " + (this.dan*number));
		}
	}
	
//	int dan;
//	public void inputDan() {
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("원하는 단을 입력해 주세요.");
//		
//		try {
//			String inputText = s.nextLine();
//			this.dan = Integer.parseInt(inputText);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		this.printResult();
//		
//	}
//	public void printResult() {
//		for( int i=0; i<9; i++) {
//			int number = i+1;
//			System.out.println(this.dan + " x " + number + " = " + (this.dan*number));
//		}
//	}
}
