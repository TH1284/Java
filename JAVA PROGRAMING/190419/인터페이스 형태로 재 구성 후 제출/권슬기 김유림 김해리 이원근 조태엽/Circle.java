import java.util.Scanner;

public class Circle implements Figure { // 얘는 제네릭 필요없어, 아무것도 안 받잖아

	String name = "원의 넓이 구하기"; //얘랑 Figure의 String name 이랑 다른 애야. 
	                            //interface 에서 define 되면 수정할 수는 없대.

	Circle() {
		this.name = "원의 넓이야";
	}

	double radius = 0.0;
	Scanner s = new Scanner(System.in);

	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		System.out.println("반지름을 입력해주세요(cm)");
		radius = s.nextDouble();
//		int a = MAX;
//		System.out.println(a);
	}

	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		System.out.println(this.name); // interface Figure 의 String name 도 가져오네
		double result = (double) Math.pow(radius, 2) * Math.PI;
		System.out.println("원의 넓이는: " + String.format("%.3f", result) + "입니다");

	}

}
