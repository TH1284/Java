import java.util.Scanner;

public class Figure3 extends Figure{

	Figure3(){
		this.name = "원의 넓이 구하기";
	}
	
	double radius = 0.0;
	Scanner s = new Scanner(System.in);
	
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		System.out.println("반지름을 입력해주세요(cm)");		
	    radius = s.nextDouble(); 
	}
	
		public void printResult() {
		System.out.println(this.name);
		double result = (double)Math.pow(radius,2) * Math.PI; 	
		System.out.println("원의 넓이는: " + String.format("%.3f", result) + "입니다");
		}
	}
