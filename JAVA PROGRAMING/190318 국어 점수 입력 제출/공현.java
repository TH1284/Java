import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("score1");
		int score1 = s.nextInt();
		System.out.println("score2");
		int score2 = s.nextInt();
		System.out.println("score3");
		int score3 = s.nextInt();
		int grade1 = 0;
		int grade2 = 0;
		int grade3 = 0;
		if ((score1 > score2) && (score1 > score3)) {
			grade1 = 1;
			if (score2 > score3) {
				grade2 = 2;
				grade3 = 3;
			} else if (score3 > score2){
				grade2 = 3;
				grade3 = 2;
			} else {
				grade2 = 2;
				grade3 = 2;
			}
		}else if ((score2 > score1) && (score2 > score3)) {
			grade2 = 1;
			if (score1 > score3) {
				grade1 = 2;
				grade3 = 3;
			} else if (score3 > score1){
				grade3 = 2;
				grade1 = 3;
			} else {
				grade1 = 2;
				grade3 = 2;
			}
		} else if((score3 > score1) && (score3 > score2)) {
			grade3 = 1;
			if (score1 > score2) {
				grade1 = 2;
				grade2 = 3;
			} else if (score2 > score1) {
				grade2 = 2;
				grade1 = 3;
			} else {
				grade1 = 2;
				grade2 = 2;
			}
		}
		System.out.println("score1 : " + score1);
		System.out.println("score2 : " + score2);
		System.out.println("score3 : " + score3);
		System.out.println("grade1 : " + grade1);
		System.out.println("grade2 : " + grade2);
		System.out.println("grade3 : " + grade3);
	}
}