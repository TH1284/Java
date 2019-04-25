import java.util.Random;

public class 임태현 {
public static void main(String[] args) {
	Random randomNumber = new Random();
	int a1 = randomNumber.nextInt(100);
	int b1 = randomNumber.nextInt(100);
	int c1 = randomNumber.nextInt(100);
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(c1);
	System.out.println("순위는");
	
	if ((a1>=b1) && (b1>=c1)) {
		System.out.println("1등a1 2등b1 3등c1");
	}else if ((a1>=c1) && (c1>=b1)) {
			System.out.println("1등a1 2등c1 3등b1");
	}else if ((b1>=a1) && (a1>=c1)) {
		System.out.println("1등 b1 2등a1 3등c1");
	}else if ((b1>=c1) && (c1>=a1)) {
		System.out.println("1등b1 2등c1 3등a1");
	}else if ((c1>=a1) && (a1>=b1)) {
		System.out.println("1등c1 2등a1 3등b1");
	}else if ((c1>=b1) && (b1>=a1)) {
		System.out.println("1등c1 2등b1 3등a1");
	}
}
}
