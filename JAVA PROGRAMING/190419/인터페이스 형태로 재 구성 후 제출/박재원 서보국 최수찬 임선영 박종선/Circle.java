import java.util.Scanner; //ctrl+Shift +f는 정렬

public class Circle extends Figure  {

	double pi = 3.14;

	Circle(){
		this.name = "원의 넓이 구하기";
	}
	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름의 길이를 입력해주세요(cm)");
		this.side1 = scanner.nextInt();	
		this.area = (double)this.pi * (side1 * side1);
	}

	public void printResult() {
		super.printResult();
		System.out.println("반지름의 넓이가 " + this.side1 + "인 원의 넓이는 " + area + "입니다.");
	}


}
