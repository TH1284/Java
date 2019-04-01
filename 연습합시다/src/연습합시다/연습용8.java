package 연습합시다;

import java.util.Scanner;

public class 연습용8 {
	public double weight;
	public int height;
	
	public void inputData() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("체중 입력(단위 kg) : ");
		this.weight = s.nextDouble();
		
		System.out.println("신장 입력(단위cm) : ");
		this.height = s.nextInt();
	}
	
	public void result() {
		double calcResult = (double)this.weight / ((this.height * this.height)/10000);
		
		if(calcResult >= 30) {
			System.out.println("비만입니다.");
		}else if (calcResult >= 24) {
			System.out.println("과체중입니다.");
		}else if (calcResult >= 20) {
			System.out.println("정상입니다.");
		}else if (calcResult >= 15) {
			System.out.println("저체중입니다.");
		}else if (calcResult >= 13) {
			System.out.println("여윔");
		}else if (calcResult >= 10) {
			System.out.println("영양실조");
		}else {
			System.out.println("소모증");
		}
	}
}
