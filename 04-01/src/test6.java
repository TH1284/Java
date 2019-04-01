import java.util.Scanner;

public class test6 {
	
	public static void main(String[] args) {
		double korSum = 0;
		double engSum = 0;
		double mathSum = 0;
		
		test5[] sArray1 = new test5[5];
		Scanner scan1 = new Scanner(System.in);
		for (int i =0; i < sArray1.length; i++) {
			sArray1[i] = new test5();
			System.out.println("" + (i + 1) + "번쨰 학생 데이터 입력");
			System.out.print("이름 : ");
			sArray1[i].name = scan1.nextLine();
			System.out.print("국어점수 : ");
			String korString = scan1.nextLine();
			sArray1[i].korScore1 = Integer.parseInt(korString);
			System.out.print("영어점수 :");
			String engString = scan1.nextLine();
			sArray1[i].engScore1 = Integer.parseInt(engString);
			System.out.print("수학점수 : ");
			String mathString = scan1.nextLine();
			sArray1[i].mathScore1 = Integer.parseInt(mathString);
			System.out.println("총점 : "+ (sArray1[i].korScore1 + sArray1[i].engScore1 + sArray1[i].mathScore1));
			System.out.println("평균 : "+ ( sArray1[i].korScore1 + sArray1[i].engScore1 + sArray1[i].mathScore1)/ 3 );
			korSum += sArray1[i].korScore1;
			engSum += sArray1[i].engScore1;
			mathSum += sArray1[i].mathScore1;
		}       
		
		System.out.println("국어총점 : " + korSum);
		System.out.println("영어총점 : " + engSum);
		System.out.println("수학총점 : " + mathSum);
		
		System.out.println("국어 평균 : " + korSum / sArray1.length);
		System.out.println("영어 평균 : " + engSum / sArray1.length);
		System.out.println("수학 평균 : " + mathSum / sArray1.length);
		
	}
}
