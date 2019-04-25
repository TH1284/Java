import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Student2[] sArray = new Student2[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student2();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.println("이름 : ");
			sArray[i].name = scan.nextLine();
			System.out.println("국어점수 : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
			System.out.println("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			System.out.println("수학점수 : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
		}
		
	}
}
