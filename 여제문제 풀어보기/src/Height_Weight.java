import java.util.Scanner;

public class Height_Weight {
	int height = 0;
	double weight = 0;
	
	public void inputValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해 주세요.");
		this.height = scan.nextInt();
		System.out.println("몸무게를 입력해 주새요.");
		this.weight = scan.nextInt();
	}
	
	public void result() {
		double kaupResult = this.weight / ((this.height * this.height)/10000);
		
		if(kaupResult >= 30) {
			System.out.println("비만");
		}
		else if(kaupResult>=24) {
			System.out.println("고체중");
		}
		else if(kaupResult>20) {
			System.out.println("정상");
		}
		else if(kaupResult>15) {
			System.out.println("저체중");
		}
		else if(kaupResult>13) {
			System.out.println("여윔");
		}
		else if(kaupResult>10) {
			System.out.println("영양 실조증");
		}
		else {
			System.out.println("소모증");
		}
	}
}
