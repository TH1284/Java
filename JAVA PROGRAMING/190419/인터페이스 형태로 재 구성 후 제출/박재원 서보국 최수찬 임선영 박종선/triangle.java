import java.util.Scanner;

public class triangle extends Figure{
	
	triangle(){
		this.name = "삼각형의 넓이 구하기";
	}
	
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("변의 길이를 입력해주세요(cm)");
		this.side1 = scan.nextInt();
		System.out.println("높이의 길이를 입력해주세요(cm)");
		this.height = scan.nextInt();
		
		this.area = (this.side1*this.height)/2;
		
	}
	public void printResult() {
		super.printResult();
		System.out.println("밑변의 길이가 "+ this.side1+ "이고 높이가 " + this.height + "인 삼각형의 넓이는" + this.area + "입니다");
	}
	

}
