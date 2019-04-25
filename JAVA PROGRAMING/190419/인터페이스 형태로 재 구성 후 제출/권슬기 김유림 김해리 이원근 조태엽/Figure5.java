import java.util.Scanner;

public class Figure5 implements Figure {
	double a = 0;

	String name = "정육각형";
	
	Figure5() {
		name = "정육각형";
	}

	@Override
	public void inputValue() {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("육각형 구하기 변의 값 입력 : ");
		this.a = s.nextDouble();
	}

	public void printResult() {
		System.out.println(this.name +"넓이는 :" + (6 * (a * a)) / (4 * Math.tan(Math.PI / 6)));

	}

}
