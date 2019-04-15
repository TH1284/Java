import java.util.Random;
import java.util.Scanner;

public class Student {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	int totalScore;
	public void student() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름을 입력해주세요.");
		this.name = scan.nextLine();
	}
	
	public void randomScore() {
		Random ran = new Random();
		System.out.println("국어점수는: ");
		this.korScore = ran.nextInt();
		System.out.println("영어점수는 : ");
		this.engScore = ran.nextInt();
		System.out.println("수학점수는 : ");
		this.mathScore = ran.nextInt();
	}
	
}
