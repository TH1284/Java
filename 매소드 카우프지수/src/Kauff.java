import java.util.Scanner;

public class Kauff {
	double weight = 0;
	int Height = 0;
	
	public void inputData() {
		Scanner s = new Scanner(System.in);
		System.out.println("체중(kg)를 입력해 주세요.");
		this.weight = s.nextInt();
		System.out.println("신장(cm)을 입력해 주세요.");
		this.Height = s.nextInt();
	}
	
	public void print() {
		double kauff = (this.weight) / ((this.Height * this.Height)/10000);
		
		if(kauff > 30 ) {
			System.out.println("비만");
		}else if(kauff >= 24) {
			System.out.println("과체중");
		}else if(kauff >= 20) {
			System.out.println("정상");
		}else if(kauff>15) {
			System.out.println("저체중");
		}else if(kauff>13) {
			System.out.println("여윔");
		}else if(kauff>10) {
			System.out.println("영양 실조증");
		}else {
			System.out.println("소모증");
		}
	}
}
