import java.util.Arrays;
import java.util.Random;

public class Arrangement {
	public static void main(String[] args) {
		int arr1 = 30;
		int[] randomNumber = new int[arr1];
		Random ran = new Random();
		for(int i = 0; i < arr1; i++) {
			randomNumber[i] = ran.nextInt(100)+1;
			System.out.print(randomNumber[i] + "  ");
		}
		System.out.println();
		Arrays.sort(randomNumber);
		for(int i = 0; i < arr1; i++) {
			System.out.print(randomNumber[i] + "  ");
		}
		
		
	
	}

}

