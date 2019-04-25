import java.util.Scanner;

public class Square extends Figure {
	
	Scanner scanner = new Scanner(System.in);
	
	Square(){
		this.name = "정사각형의 넓이 구하기";
	}
	
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("변의 길이를 입력해주세요(cm)");
		this.side1 = scan.nextInt();	
		this.area = (double)this.side1*this.side1;
	}
	public void printResult() {		
		super.printResult();
		System.out.println("한 변의 길이가"+ this.side1 + "인 정사각형의 의 넓이는" + area + "입니다." );
	}

	

}
