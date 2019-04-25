import java.util.Arrays;
import java.util.Random;

public class Arrangement2 {
	public static void main(String[] args) {
		int arr = 30;
		int[] number = new int[arr];
		Random r = new Random();
		for(int i=0; i<arr; i++) {
			number[i] = r.nextInt(101);
			System.out.print(number[i] + " ");
		}
		System.out.println();
		Arrays.sort(number);
		for(int i=0; i<arr; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
