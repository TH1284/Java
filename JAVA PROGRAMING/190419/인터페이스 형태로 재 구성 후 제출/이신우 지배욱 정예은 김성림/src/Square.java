import java.util.InputMismatchException;
import java.util.Scanner;

public class Square implements Figure {
	
	String name ="사각형의 넓이";
	double line1 =0;
	double line2 =0;
	String newNumber ;
	
	public void inputValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println(this.name+" 구하기*");
		System.out.println("가로 길이를 입력하세요.");
		this.newNumber = scan.nextLine();
		
		try {
			this.line1 = Double.parseDouble(newNumber);
		}catch(NumberFormatException e) {			
			System.out.println("가로 길이를 입력하세요.");
		}
		
		System.out.println("세로 길이를 입력하세요.");
		this.newNumber = scan.nextLine();
		
		try {
			this.line2 = Double.parseDouble(newNumber);
		}catch(NumberFormatException e) {		
			System.out.println("가로 길이를 입력하세요.");
		}
	}	
		
	public void result() {
		double width = (double)(this.line1 * this.line2);
		System.out.println(width);
	}


	@Override
	public void printResult() {
		// TODO Auto-generated method stub

	}
}
