import java.util.Scanner;

public class F5 {
	public double weight;
	public int height;

	public void process() {
		this.inputData();
		this.result();
}
	
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("체중입력 (단위 kg): ");
		this.weight = scan.nextDouble();
		
		System.out.println("신장입력(단위 cm): ");
		this.height = scan.nextInt();
		
	}
	public void result() {
		double calcResult = (this.weight) / ((this.height * this.height) / 10000);
//		System.out.println("계산 결과:" + calcResult);
		if(calcResult >= 30) {
			System.out.println("비만입니다.");
		}else if(calcResult >= 24) {
			System.out.println("과체중 입니다.");
		}else if(calcResult >= 20) {
			System.out.println("정상 입니다.");
		}else if(calcResult >= 15) {
			System.out.println("저체중 입니다.");
		}else if(calcResult >= 13) {
			System.out.println("여윔");
		}else if(calcResult >= 10) {
			System.out.println("영양실조");
		}else {
			System.out.println("소모증");
		}
	}
	
}
