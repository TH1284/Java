import java.util.InputMismatchException;
import java.util.Scanner;

public class Square extends Figure {
	
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
//			this.line1 = scan.nextDouble();	
		}
		
		System.out.println("세로 길이를 입력하세요.");
		this.newNumber = scan.nextLine();
		
//		try {
//			this.line2 = Double.parseDouble(newNumber);
//		}
//		//NumberFormatException e 는 nextLine으로 받아서 double로 변경할 때 나는 오류 처리, 
//		//InputMismatchException ime 는 nextInt나 nextDouble로 받았는데 숫자로 변경하려는데 나는 오류 처리
//		
//		catch(NumberFormatException e) {		
//			System.out.println("가로 길이를 입력하세요.");
//			this.line2 = scan.nextDouble();
		}	
			
	
	public void result() {
		double width = (double)(this.line1 * this.line2);
	}
}
