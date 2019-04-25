import java.util.Scanner;

public class trapeZoid implements Figure {
	double a = 0;
	double b = 0;
	double h = 0;
	double area = 0;

	public void inputValue() {
		Scanner s = new Scanner(System.in);
		System.out.println("윗변의 길이를 입력하세요.");
		try {
			this.a = s.nextDouble();
		} catch (Exception e) {
			this.a = 1;
		}
		System.out.println("밑변의 길이를 입력하세요.");
		try {
			this.b = s.nextDouble();
		} catch (Exception e) {
			this.a = 1;
		}
		System.out.println("높이의 길이를 입력하세요.");
		try {
			this.h = s.nextDouble();
		} catch (Exception e) {
			this.a = 1;
		}
		this.area = (a + b) * h / 2;
		System.out.println(this.area);
	}
	public void printResult() {
		System.out.println("사다리꼴의 넓이 : " + this.area);
	}
}
