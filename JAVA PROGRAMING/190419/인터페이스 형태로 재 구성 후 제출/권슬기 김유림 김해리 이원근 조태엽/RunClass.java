import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 사각형 넓이 구하기, 2. 사다리꼴 넓이 구하기, 3. 원 넓이 구하기, 4. 정육각형 넓이 구하기");
		int selectMenu = scanner.nextInt();
		
		Figure figure = null;
		if (selectMenu == 1) {
			figure = new quadrangle();
		} else if (selectMenu == 2) {
			figure = new LadderShape();
		} else if (selectMenu == 3) {
			figure = new Circle();
		} else if (selectMenu == 4) {
			figure = new Figure5();
		}
		figure.inputValue();
		figure.printResult();
	}
}
