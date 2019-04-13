import java.util.Scanner;

public class test2 {
	int Number1 = 0;
	int Number2 = 0;
	public void inputNumber() {
		Scanner scan = new Scanner(System.in);
		
		String tmp;
		
		System.out.println("첫번쨰 숫자를 입력하세요.");
		tmp = scan.nextLine();
		try {
			this.Number1 = Integer.parseInt(tmp);
		} catch (Exception e) {
			this.Number1 = 0;
		}
		System.out.println("두번쨰 숫자를 입력하세요.");
		tmp = scan.nextLine();
		try {
			this.Number2 = Integer.parseInt(tmp);
		} catch (Exception e) {
			this.Number2 = 0;
		}
		
	}
	
	public void Division() {
		double resultNumber = 0;
		resultNumber = ((double)this.Number1 / this.Number2);
		resultNumber = (double)Math.round(resultNumber*1000 / 1000);
		System.out.println("" + this.Number1 + "나누기" + this.Number2 + "=" + resultNumber+ "입니다");
	}
}
