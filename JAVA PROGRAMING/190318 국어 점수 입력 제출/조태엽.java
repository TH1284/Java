import java.util.Arrays;
import java.util.Scanner;

public class Ranking {
	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		int languageScore1 = s.nextInt();
		System.out.println(languageScore1);
		int languageScore2 = s.nextInt();
		System.out.println(languageScore2);
		int languageScore3 = s.nextInt();
		System.out.println(languageScore3);
		
		int[] grade = {languageScore1, languageScore2, languageScore3};
		
		for ( int n; n < 3; n++) {
			for( int i; i < n-i; i++) {
				if(grade[i]>grade[i+1]) {
					int temp = grade[i];
					grade[i] = grade[i+1];
					grade[i+1] = temp;
				}
			}
			
			
			System.out.println(Arrays.toString(grade[2]);
			System.out.println(Arrays.toString(grade[1]);
			System.out.println(Arrays.toString(grade[0]);
		}
				

	}
}
