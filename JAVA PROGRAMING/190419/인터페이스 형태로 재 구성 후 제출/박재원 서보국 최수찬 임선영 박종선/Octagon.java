import java.util.Scanner;

public class Octagon extends Figure {

	Octagon(){
		this.name = "정팔각형 넓이 구하기";
	}
	public void inputValue() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("변의 길이를 입력해주세요(cm)");
		this.side1 = scan.nextInt();
		this.area = 2*(Math.sqrt(2)-1)*(Math.pow(this.side1, 2));
	}
	
	public void printResult() {		
		super.printResult(); //Figure에 있는 printResult의 내용을 출력하게함		
		System.out.printf("한변의 길이가 " + this.side1 + "인 정팔각형의 넓이는 %.2f입니다.",this.area);
		System.out.println();
	}
}
