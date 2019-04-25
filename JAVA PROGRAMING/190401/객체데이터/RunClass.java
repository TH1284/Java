import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Student[] sArray = new Student[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.print("이름 : ");
			sArray[i].name = scan.nextLine();
			System.out.print("국어점수 : ");
			sArray[i].korScore = scan.nextInt();
			System.out.print("영어점수 : ");
			sArray[i].engScore = scan.nextInt();
			System.out.print("수학점수 : ");
			sArray[i].mathScore = scan.nextInt();
			scan.nextLine();
		}
		
	}
}
