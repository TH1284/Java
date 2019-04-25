import java.util.Scanner;

public class Circle extends Figure {
	double radius;
	double width;
	
	Circle(){
		this.name = "원의 넓이 구하기";
	}

	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		super.printResult();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요.");
		String tmp = scan.nextLine();
		scan.close();
		try {
			this.radius = Double.parseDouble(tmp);
		} catch (Exception e) {
			System.out.println("반지름은 숫자만 입력해주세요.");
			this.radius = 0;
		}
	}

	public void result() {
		super.printResult();
		this.width = (Math.pow(this.radius, 2) *  Math.PI);
		System.out.println(this.width);
	}

}
