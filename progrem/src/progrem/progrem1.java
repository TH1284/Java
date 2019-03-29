package progrem;

import java.util.Scanner;

public class progrem1 {
	public double height;
	public double weight;
	public void prog() {
	Scanner s = new Scanner(System.in);
//	System.out.println("체중입력");
//	int weight = s.nextInt();
	
//	System.out.println("신장입력");
	double height = s.nextDouble();
	double weight = s.nextDouble();
	double a = weight / (height * height);
		if(a < 10) {
			System.out.println(a + "소모증");
		}else if( a >=10 && a < 13 ){
			System.out.println(a + "영양 실조증");
		}else if(a>=13 && a<15) {
			System.out.println(a+"여윔");
		}else if(a>=15 && a<20) {
			System.out.println(a+"저체중");
		}else if(a>=20 && a<24) {
			System.out.println(a+"정상");
		}else if(a>=24 &&a<29) {
			System.out.println(a+"과체중");
		}
	}
	
}
