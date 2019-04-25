import java.util.Scanner;

public class forPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생1의 국어 점수를 입력하세요");
		int score1 = s.nextInt();
		System.out.println("학생2의 국어 점수를 입력하세요");
		int score2 = s.nextInt();
		System.out.println("학생3의 국어 점수를 입력하세요");
		int score3 = s.nextInt();
		System.out.println("입력 받은 점수\n학생1 : " + score1 + ", 학생2 : " + score2 + ", 학생3 : " + score3);
		if ((score1 > score2) && (score2 > score3)) {
			System.out.println("1등 : 학생1(" + score1 + "점), 2등 : 학생2(" + score2 + "점), 3등 : 학생3(" + score3 + "점)");
		} else if ((score1 > score2) && (score1 > score3) && (score3 > score2)) {
			System.out.println("1등 : 학생1(" + score1 + "점), 2등 : 학생3(" + score3 + "점), 3등 : 학생2(" + score2 + "점)");
		} else if ((score2 > score1) && (score1 > score3)) {
			System.out.println("1등 : 학생2(" + score2 + "점), 2등 : 학생1(" + score1 + "점), 3등 : 학생3(" + score3 + "점)");
		} else if ((score2 > score1) && (score2 > score3) && (score3 > score1)) {
			System.out.println("1등 : 학생2(" + score2 + "점), 2등 : 학생3(" + score3 + "점), 3등 : 학생1(" + score1 + "점)");
		} else if ((score3 > score1) && (score1 > score2)) {
			System.out.println("1등 : 학생3(" + score3 + "점), 2등 : 학생1(" + score1 + "점), 3등 : 학생2(" + score2 + "점)");
		} else if ((score3 > score1) && (score3 > score2) && (score2 > score1)) {
			System.out.println("1등 : 학생3(" + score3 + "점), 2등 : 학생2(" + score2 + "점), 3등 : 학생1(" + score1 + "점)");
		} else if ((score1 == score2) && (score2 == score3)) {
			System.out.println("1등 : 학생1(" + score1 + "점), 학생2(" + score2 + "점), 학생3(" + score3 + "점)");
		} else if ((score1 == score2) && (score2 > score3)) {
			System.out.println("1등 : 학생1(" + score1 + "점), 학생2(" + score2 + "점), 2등 : 학생3(" + score3 + "점)");
		} else if ((score1 == score2) && (score3 > score1)) {
			System.out.println("1등 : 학생3(" + score3 + "점), 2등 : 학생1(" + score1 + "점), 학생2(" + score2 + "점)");
		} else if ((score2 == score3) && (score3 > score1)) {
			System.out.println("1등 : 학생2(" + score2 + "점), 학생3(" + score3 + "점), 2등 : 학생1(" + score1 + "점)");
		} else if ((score2 == score3) && (score1 > score2)) {
			System.out.println("1등 : 학생1(" + score1 + "점), 2등 : 학생2(" + score2 + "점), 학생3(" + score3 + "점)");
		} else if ((score1 == score3) && (score3 > score2)) {
			System.out.println("1등 : 학생1(" + score1 + "점), 학생3(" + score3 + "점), 2등 : 학생2(" + score2 + "점)");
		} else if ((score1 == score3) && (score2 > score3)) {
			System.out.println("1등 : 학생2(" + score2 + "점), 2등 : 학생1(" + score1 + "점), 학생3(" + score3 + "점)");
		}
	}
}
