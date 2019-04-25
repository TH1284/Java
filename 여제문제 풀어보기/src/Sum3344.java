import java.util.Arrays;
import java.util.Scanner;

public class Sum3344 {
	public static void main(String[] args) {
		int [][]arr= new int[4][4];
		Scanner scanner = new Scanner(System.in);
//		for(int i=0; i<arr.length-1; i++) {
//			
//			for(int j=0; j<arr.length-1; j++) {
//		
//				arr[i][j]=scanner.nextInt();
//				System.out.println();
//				arr[i][j] = arr[3][3] + arr[i][j];
//				arr[i][3] = arr[i][3] + arr[i][j];
//				arr[3][i] = arr[3][i] + arr[j][i];
//
//
//			}
//		}
//		for(int i=0; i<arr.length; i++) {
//		System.out.printf(Arrays.toString(arr[i]));
//		}
		
		
		
		System.out.println("숫자를 입력해주세요.");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[i][j] = scanner.nextInt();
				arr[3][3] = arr[3][3] + arr[i][j];
				arr[i][3] = arr[i][3] + arr[i][j];
				arr[3][j] = arr[3][j] + arr[i][j];
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
}
