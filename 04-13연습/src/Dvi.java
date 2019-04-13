import java.util.Scanner;

public class Dvi {
	int number1 = 0;
	int number2 = 0;
	
	public void Number() {
		Scanner scanner = new Scanner(System.in);
		
		String A;
		System.out.println("첫번째 숫자를 입력해 주세요.");
		try {
			A = scanner.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			this.number1 = 0;
		}
		System.out.println("두번째 숫자를 입력해 주세요.");
		try {
			A = scanner.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			this.number2 = 0;
		}
//		System.out.println("첫번째 숫자를 입력해 주세요.");
//		this.number1 = scanner.nextInt();
//		System.out.println("두번째 숫자를 입력해 주세요.");
//		this.number2 = scanner.nextInt();
	}
	
	public void printgg() {
		double resultNumber = 0;
		resultNumber = ((double)this.number1 / this.number2);
		resultNumber = (double)(Math.round(resultNumber*1000) / 1000.0);
		System.out.println(" " + this.number1 + "나누기" + this.number2 + "는" + resultNumber + "입니다");
		
	}
}
