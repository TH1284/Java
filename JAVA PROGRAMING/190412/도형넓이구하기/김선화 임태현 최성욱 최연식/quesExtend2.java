import java.util.Scanner;

public class quesExtend2 extends quesExtend1 { //자식클래스
	//오각형 넓이구하기
	double downCase=0;//밑변 변수선언
	double upCase=0;//높이 변수선언
	double outResult=0;//결과값 변수선언
	quesExtend2() {
		this.name="오각형 넓이 구하기";
	}
	
	@Override //기존 inputValue 가지고 재정의해주는 보조역할함.
	public void inputValue() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("밑변");
		this.downCase=s.nextDouble();
		
		System.out.println("높이");
		this.upCase=s.nextDouble();				
	}
	
		public void printResult() {
			
			outResult=(((double)((this.downCase * this.upCase)) / 2) * 5);
			System.out.println("오각형 넓이는"+this.downCase + "*" + this.upCase
					+ "*" + "5" + "=" + outResult + "(cm**2)"+"입니다");
	}
}
