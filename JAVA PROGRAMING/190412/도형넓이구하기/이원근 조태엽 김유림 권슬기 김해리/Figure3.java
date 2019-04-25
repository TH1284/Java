import java.util.Scanner;

public class Figure3 extends Figure{

	String name = "원의 넓이 구하기";
	double radius = 0;
	Scanner s = new Scanner(System.in);
	
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		
			
		System.out.println("반지름을 입력해주세요");		
	    radius = s.nextInt();
	
	}
	
		public void printResult() {
		System.out.println(this.name);
		double result = (double)Math.pow(radius,2) * Math.PI; 	
		}
	}


