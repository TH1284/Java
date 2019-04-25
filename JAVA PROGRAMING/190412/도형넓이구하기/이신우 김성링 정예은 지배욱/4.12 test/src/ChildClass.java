import java.util.Scanner;

public class ChildClass extends Figure {
	
	String name ="사다리꼴의 넓이";
	double height;
	double bottom; 
	double top;
	String newNumber;
	
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//높이
		System.out.println("*사다리꼴의 넓이 구하기");
		System.out.println("높이를 입력하세요.");
		this.newNumber = scan.nextLine();
		try {
			this.height = Double.parseDouble(newNumber);
		}catch(NumberFormatException e) {
			System.out.println("높이를 입력하세요.");
//			this.height = scan.nextDouble();
		}
		//아랫변
		System.out.println("아랫변의 길이를 입력하세요.");
		this.newNumber = scan.nextLine();
	
		try {
			this.bottom = Double.parseDouble(newNumber);
		}catch(NumberFormatException e) {
			System.out.println("높이를 입력하세요.");
//			this.bottom = scan.nextDouble();
		}
		
		System.out.println("윗변의 길이를 입력하세요.");
		this.newNumber = scan.nextLine();
		
		try {
			this.top = Double.parseDouble(newNumber);
		}catch(NumberFormatException e) {
			System.out.println("높이를 입력하세요.");
//			this.top = scan.nextDouble();
		}
	}
	
	
	public void result () {
		double width=(double)(((this.bottom+this.top)*this.height)/2);
		System.out.println(this.name + width);
	}

}
