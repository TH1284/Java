import java.util.Scanner;

public class quadrangle implements Figure {
	String name = "사각형";
	
	int width = 0;
	int height = 0;
	int printSum = 0;
	
	@Override
	public void inputValue () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로를 입력하세요");
		this.width = scanner.nextInt();
		System.out.println("세로를 입력하세요");
		this.height = scanner.nextInt();
	}

	public void printResult() {
		this.printSum = this.width*this.height;
		System.out.println(this.name + "의 넓이는: " + printSum);
		

 }
 
}
