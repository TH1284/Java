import java.util.Scanner;

public class ProjWidth implements Figure{
	int inputNum = 0 ;
	int distanc = 0;
	int height = 0;
	double resultWidth = 0;
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("넓이를 구학 다각형의 숫자를 입력해 주세요");
		this.inputNum = scanner.nextInt();
		System.out.println("변의 길이를 입력해 주세요");
		this.distanc = scanner.nextInt();
		System.out.println("높이를 입력해 주세요");
		this.height = scanner.nextInt();
		this.resultWidth = ((((0.5)*this.distanc)*this.height)*this.inputNum);
	}
	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		
		System.out.println(this.inputNum + "의 넓이는" + resultWidth + "입니다");
	}
	
//	public void inputValue() {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("넓이를 구학 다각형의 숫자를 입력해 주세요");
//		this.inputNum = scanner.nextInt();
//		System.out.println("변의 길이를 입력해 주세요");
//		this.distanc = scanner.nextInt();
//		System.out.println("높이를 입력해 주세요");
//		this.height = scanner.nextInt();
//		
////		다각형 넓이
//		
//	    this.resultWidth = ((((0.5)*this.distanc)*this.height)*this.inputNum);
//		
//	}
//public void printResult() {
//	System.out.println(this.inputNum + "의 넓이는" + resultWidth + "입니다");
//}
}
