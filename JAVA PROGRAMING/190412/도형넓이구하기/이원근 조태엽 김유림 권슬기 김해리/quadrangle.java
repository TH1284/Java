import java.util.Scanner;

public class quadrangle extends Figure {
	int width = 0;
	int height = 0;
	int printSum = 0;
	
	@Override
	public void inputValue () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로 길이를 입력하세요");
		this.width = scanner.nextInt();
		System.out.println("세로 길이를 입력하세요");
		this.height = scanner.nextInt();
	}

	public void printResult() {
		this.printSum = this.width*this.height;
		System.out.println("사각형의 넓이: " + width*width);

 }
 
}
