import java.util.Scanner;

public class LadderShape implements Figure {
	double up;
	double down;
	double height;
	double resultValue;
	@Override
	public void inputValue() {
			Scanner scan = new Scanner(System.in);
			System.out.println("윗변을 입력하세요 :");
			this.up = scan.nextDouble();
			System.out.println("아랫변을 입력하세요");
			this.down = scan.nextDouble();
			System.out.println("높이를 입력하세요");
			this.height = scan.nextDouble();
			this.resultValue = (this.up + this.down)*this.height /2;
			
	}
	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		System.out.println("사다리꼴의 넓이는" + resultValue + "입니다.");	
	}
		
	}

