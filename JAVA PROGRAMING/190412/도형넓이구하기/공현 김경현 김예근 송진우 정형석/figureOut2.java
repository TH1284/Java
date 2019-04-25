import java.util.Scanner;

public class figureOut2 extends Figure {

	@Override
	public void inputValue() {
		System.out.println("정n각형의 넓이를 구합니다.");
		System.out.print("n = ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("변 : ");
		double a = s.nextDouble();
		double result = n / 4 / Math.tan(Math.toRadians(Math.PI / n));
		System.out.println("정" + n + "각형의 넓이 : " + result);
	}
}
