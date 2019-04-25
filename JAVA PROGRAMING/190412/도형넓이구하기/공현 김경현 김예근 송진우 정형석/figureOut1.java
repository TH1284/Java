import java.util.Scanner;

public class figureOut1 extends Figure {
//	public void triangle() {
//		System.out.println("삼각형의 넓이를 구합니다.");
//		System.out.print("밑변 : ");
//		Scanner s = new Scanner(System.in);
//		double a = s.nextDouble();
//		System.out.print("높이 : ");
//		double h = s.nextDouble();
//		double result = 0.5 * a * h;
//		System.out.print("삼각형의 넓이 : " + result);
//	}

//	public void Rectangle() {
//		System.out.println("사각형의 넓이를 구합니다.");
//		System.out.print("밑변 : ");
//		Scanner s = new Scanner(System.in);
//		double a = s.nextDouble();
//		System.out.print("높이 : ");
//		double h = s.nextDouble();
//		double result = a * h;
//		System.out.print("사각형의 넓이 : " + result);
//	}

//	public void Circle() {
//		System.out.println("원의 넓이를 구합니다.");
//		System.out.print("반지름 : ");
//		Scanner s = new Scanner(System.in);
//		double r = s.nextDouble();
//		double result = Math.PI * r * r;
//		System.out.print("사각형의 넓이 : " + result);
//	}

//	public void Trapezoid() {
//		System.out.println("사다리꼴의 넓이를 구합니다.");
//		System.out.print("밑변 : ");
//		Scanner s = new Scanner(System.in);
//		double a = s.nextDouble();
//		System.out.print("윗변 : ");
//		double b = s.nextDouble();
//		System.out.print("높이 : ");
//		double h = s.nextDouble();
//		double result = (a + b) * h / 2;
//		System.out.print("사각형의 넓이 : " + result);
//	}

//	public void regularPolygon() {
//		System.out.println("정n각형의 넓이를 구합니다.");
//		System.out.print("n = ");
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		System.out.print("변 : ");
//		double a = s.nextDouble();
//		double result = n / 4 / Math.tan(Math.toRadians(Math.PI / n));
//		System.out.println("정" + n + "각형의 넓이 : " + result);
//	}

	@Override
	public void inputValue() {
		System.out.println("사각형의 넓이를 구합니다.");
		System.out.print("밑변 : ");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.print("높이 : ");
		double h = s.nextDouble();
		double result = a * h;
		System.out.print("사각형의 넓이 : " + result);
	}
}
