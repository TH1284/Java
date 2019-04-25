import java.util.Scanner;

public class FigureCircle extends Figure {
	
	FigureCircle() {
		this.name = "원 넓이 구하기";
	}
	
	double r = 0;
	double circleArea = 0;

	public void inputValue() {

		Scanner s = new Scanner(System.in);

		System.out.println("원의 반지름을 입력해주세요! (cm)");
		this.r = s.nextDouble();

		this.circleArea = Math.PI * Math.pow(this.r, 2);


	}
	public void printResult() {
		System.out.println("원의 넓이는 : " + this.circleArea);
	}

}
