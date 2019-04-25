import java.util.Scanner;

public class FigureCircle implements Figure {
	
	double r = 0;
	double circleArea = 0;

	public void inputValue() {

		Scanner s = new Scanner(System.in);

		System.out.println("반지름을 입력해 주세요! (cm)");
		this.r = s.nextDouble();

		this.circleArea = Math.PI * Math.pow(this.r, 2);


	}
	public void printResult() {
		System.out.println("원의 넓이 : " + this.circleArea);
	}

}
