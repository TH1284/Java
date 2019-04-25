import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("원하시는 도형의 번호를 입력해주세요");
			System.out.println("1.삼각형 2.원 3.정팔각형 4.사다리꼴 5.사각형");
			
			int inputNum = scan.nextInt();
			Figure figure = new Figure();
			figure.toString();
//			Object figure = new Octagon();
			if(inputNum==3) {
				figure = new Octagon();		
//				Octagon test = (Octagon)figure; // 이런식으로 사용 할 수도 있음
			}else if(inputNum==2){
				figure = new Circle();
			}
			else if(inputNum==4){
				figure = new Hercules();
			}else if(inputNum==1){
				figure = new triangle();
			}
			else if(inputNum==5){
				figure = new Square();
			}
			
			
			figure.inputValue();
			figure.printResult();
			System.out.println();
			
		}

	}
}
