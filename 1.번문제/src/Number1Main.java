
public class Number1Main {
	public static void main(String[] args) {
		int proNumber;
		int sum = 0;
		Number1 n = new Number1();
		System.out.println("5의 배수는");
		for (int i = 1; i <= 1000; i++) {
			proNumber = i +1;
			boolean result = n.doCheck(proNumber);
			if(result) {
				System.out.print(" " + (proNumber));
				sum += proNumber;
			}
		}
		System.out.println();
		System.out.print("5의 배수의 합은 : " + sum);
	}
}
