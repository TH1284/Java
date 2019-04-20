import java.util.Scanner;

public class rectangle implements Figure{

	int width = 0;
	int row = 0;
	int rect = 0;
	@Override
	public void inputValue() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로입력");
		this.width = scan.nextInt();
		
		System.out.println("세로 입력");
		this.row = scan.nextInt();
		
		rect = this.width * this.row;
	}
	@Override
	public void printResult() {
		printResult();
		System.out.println("사각형의 넓이는" + rect +"입니다.");
	}
}
