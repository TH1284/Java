import java.util.Scanner;

public  class Hercules extends Figure {
	

	Hercules(){
		this.name = "사다리꼴 넓이 구하기";
	}
	
	@Override
	public void inputValue() {		
		Scanner scan = new Scanner(System.in);
		System.out.println("input side a :");
		System.out.println("input side b :");
		System.out.println("input Height h :");
		this.side1 = scan.nextInt();
		this.side2 = scan.nextInt();
		this.height = scan.nextInt();
		this.area = 0.5*(side1 + side2)*height;
	}
	
	@Override
	public void printResult() {
		super.printResult();
		System.out.println("한변의 길이가 "+side1+"이고 다른 변의 길이가 "+side2+"이며 높이가 " + height + "인 사다리꼴의 넓이는 " + area + "입니다.");
	}

}
