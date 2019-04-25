import java.util.Scanner;

public class Triangle implements Figure {
	
	String name;
	int height = 0;
	int bottom = 0;
	String tmp;
	
	Triangle(){
		this.name = "삼각형 넓이 구하기";
	}
	
	@Override
	public void inputValue() {
//		String tmp;
		// TODO Auto-generated method stub
		// super.printResult();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("높이를 입력하세요.");
		tmp = scan.nextLine();
		try {
			this.height = Integer.parseInt(tmp);
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요.");
			this.height = 0;
		}
		
		
		System.out.println("밑변의 길이를 입력하세요.");
		tmp = scan.nextLine();
		try {
			this.bottom = Integer.parseInt(tmp);
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요.");
			this.bottom = 0;
		}
		
	}
	
	public void result () {
		double width=(double)(((this.height * this.bottom)/2));
		System.out.println(this.name + width + "입니다.");
	}

	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		
	}

}
