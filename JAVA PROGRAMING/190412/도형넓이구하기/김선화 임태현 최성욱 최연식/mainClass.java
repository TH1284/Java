import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.  다각형 넓이 구하기, 2. 사각형 넓이 구하기, 3. 원 넓이 구하기 4. 오각형 구하기" );
		int selectMenu = scanner.nextInt();
		
		Figure figure = null;
		if (selectMenu == 1) {
			figure = new ProjWidth();
		} else if (selectMenu == 2) {
			figure = new rectangle();
		} else if (selectMenu == 3) {
			figure = new circle();
		}else if (selectMenu == 4) {
			figure = new quesExtend2();
		}
		
		figure.inputValue();
		figure.printResult();
	}
		
	
}
