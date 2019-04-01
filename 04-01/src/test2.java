import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
//		test1 s1 = new test1();
//		s1.name = "홍길동";
//		s1.korScore = 100;
//		s1.engScore = 30;
//		s1.matthScore = 20;
//		s1.memo = "메사에 진취적임";
		
		
		test1[] sArray = new test1[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new test1();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.print("이름 : ");
			sArray[i].name = scan.nextLine();
			System.out.print("국어점수 : ");  //"100" => 100
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);// -> String을 Int로 변환
			System.out.print("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			System.out.print("수학점수 : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
			scan.nextLine();
		}
}
}
