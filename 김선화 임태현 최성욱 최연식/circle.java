import java.util.Scanner;

public class circle extends Figure{
	
	int r = 0;
	double pi = 3.14;
	
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("반지름(r) 값을 입력해 주세요.");
		this.r = s.nextInt();
		
	}
	public void printResult() {
		double resultNumber = 0;
		resultNumber = ((double)this.pi*this.r*r);
		System.out.println(" "+ "원의 넓이는" + "pi" + "x" + "r^2" + "=" + resultNumber);
		
		
		
		
		
	}
}
