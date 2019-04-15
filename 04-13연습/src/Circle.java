import java.util.Scanner;

public class Circle extends Figure{
	int r = 0;
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("r값을 입력해 주세요.");
		this.r = s.nextInt();
	}

	
	public void println() {
		double resultNumber= 0;
		resultNumber = (double)Math.PI * (r*r);
		System.out.println("넓이는" + resultNumber + "입니다.");
	}
}
