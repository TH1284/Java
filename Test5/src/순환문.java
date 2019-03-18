
public class 순환문 {
	public static void main(String[] args) {
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//			for (int j = 0; j < 4; j++) {
//				System.out.println(j);

//		int a =0;
//		while (true) {
//			System.out.println(a);
//			a++;
//			if (a > 10000) {
//				break;
//			}
//		}
		for ( int i = 0; i < 100; i++) {
			System.out.print("a");
			if(i == 98) {
				continue;
			}
			System.out.println(i);
		}
		}
	}
