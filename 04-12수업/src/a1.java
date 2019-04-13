import java.util.Scanner;

public class a1 {
	int a = 0;
	int b = 0;
	public void inputnum() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자");
		this.a = s.nextInt();
		System.out.println("두번째 숫자");
		this.b = s.nextInt();
	}
	
	public void pResult() {
		double c = 0;
		c = ((double)this.a / this.b);
		c= (double)Math.round(c*100 / 100);
		System.out.println(""+ a + "나누기" + b + "는" + c + "입니다");
	}
}



