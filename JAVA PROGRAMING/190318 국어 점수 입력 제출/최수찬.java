import java.util.Arrays;
import java.util.Scanner;

public class forTest {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		System.out.println("3명의 점수를 입력해주세요");
		int inputScore1 = score.nextInt();
		int inputScore2 = score.nextInt();
		int inputScore3 = score.nextInt();
		
		int[] scoreArrays = new int[] {inputScore1, inputScore2, inputScore3};
		Arrays.sort(scoreArrays);

		System.out.println("3등 : " + scoreArrays[0]);
		System.out.println("2등 : " + scoreArrays[1]);
		System.out.println("1등 : " + scoreArrays[2]);
		
		
	}
}
