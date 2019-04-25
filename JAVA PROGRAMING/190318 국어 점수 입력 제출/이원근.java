import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("당신의 등수는?");
		
		Random s = new Random();
//		int a = 100;
//		int b = 90;
//		int c = 60;
		int a = s.nextInt(100)+1;
		int b = s.nextInt(100)+1;
		int c = s.nextInt(100)+1;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	if (a >= b && a >= c) {
		System.out.println("aStudent");
	}else if (b >= a && b >= c) {
		System.out.println("bStudent");
	}else {
		System.out.println("cStudent");
	}
		
	}
}
