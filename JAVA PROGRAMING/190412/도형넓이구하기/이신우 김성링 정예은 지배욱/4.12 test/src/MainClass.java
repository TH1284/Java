import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("어떤 넓이를 구하시겠습니까? 1.사다리꼴 2.사각형 3.원  4.정육각형 5.삼각형");
		int inputNum = scan.nextInt();
		
		if(inputNum == 1) {
			//사다리꼴의 넓이 구하기
			ChildClass c = new ChildClass();
			c.inputValue();
			c.result ();
			System.out.println("");
		}else if (inputNum ==2) {
			//사각형의 넓이 구하기
			Square s = new Square ();
			s.inputValue();
			s.result();
			System.out.println("");
		}else if (inputNum ==3) {
			//원의 넓이 구하기
			Circle r =new Circle();
			r.inputValue();
			r.result();
			System.out.println("");
		}else if (inputNum ==4) {
			//정육각형 넓이 구하기
			SixSquare ss = new SixSquare();
			ss.inputValue();
			ss.계산하자();
			System.out.println("");
		}else if (inputNum ==5) {
			//삼각형 넓이 구하기
			Triangle t = new Triangle();
			t.inputValue();
			t.result();
			System.out.println("");
		}
	}
}
