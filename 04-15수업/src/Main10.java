import java.util.Arrays;

public class Main10 {
	public static void main(String[] args) {
		Random10 random  = new Random10();
//		int[] arr2 = random.nextInt2(100);
		random.nextInt2(100);
		System.out.println(Arrays.toString(random.resultArr));
		double n2 = random.nextDouble();
	}
}
