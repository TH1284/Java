import java.util.Scanner;

public class quizmain {
	public static void main(String[] args) {
		System.out.println("도형 넓이 구하기");
		System.out.println("구하고 싶은 도형을 선택하세요.");
		System.out.println("1. 삼각형, 2. 사각형, 3. 원, 4. 사다리꼴, 5. 정n각형");
		Scanner s = new Scanner(System.in);
		int select = s.nextInt();
		if (select == 1) {
			Figure geo1 = new TriFigure();
			geo1.inputValue();
			geo1.printResult();
		} else if (select == 2) {
			Figure geo2 = new figureOut1();
			geo2.inputValue();
		} else if (select == 3) {
			Figure geo3 = new FigureCircle();
			geo3.inputValue();
			geo3.printResult();
		} else if (select == 4) {	Figure geo4 = new trapeZoid();
			geo4.inputValue();}
		else if (select == 5) {
			Figure geo5 = new figureOut2();
			geo5.inputValue();
		}
	}
}