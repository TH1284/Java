package zxc;

public class zxc1 {
	public static void main(String[] args) {
		pro1 c1 = new pro1();
		System.out.println("6의 배수는");
		for (int i = 0; i < 100; i++) {
			int proNumber = i +1;
			boolean result = c1.doCheck(proNumber);
			if(result) {
				System.out.print(" " + (proNumber));
			}
		}
	}
}
