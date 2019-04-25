import java.util.Scanner;

public class Grade1 {
	public static void main(String[] args) {
		int p1_score; // 홍길동
		int p2_score; // 임꺽정
		int p3_score; // 윤봉길
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요 (총 3명)");
		System.out.print("홍길동의 국어 점수 : ");
		p1_score = scan.nextInt();
		System.out.print("임꺽정의 국어 점수 : ");
		p2_score = scan.nextInt();
		System.out.print("윤봉길의 국어 점수 : ");
		p3_score = scan.nextInt();
		
		System.out.println("입력 받은 점수 홍길동 " + p1_score + "점 " + "임꺽정 " + p2_score + "점 " + "윤봉길 " + p3_score + "점");
		
		if (p1_score > p2_score && p1_score > p3_score && p2_score > p3_score) {
			// 1, 2, 3
			System.out.println("1등 : 홍길동 (" + p1_score + "점)");
			System.out.println("2등 : 임꺽정 (" + p2_score + "점)");
			System.out.println("3등 : 윤봉길 (" + p3_score + "점)");
		} else if (p1_score > p2_score && p1_score > p3_score && p2_score < p3_score) {
			// 1, 3, 2
			System.out.println("1등 : 홍길동 (" + p1_score + "점)");
			System.out.println("2등 : 윤봉길 (" + p3_score + "점)");
			System.out.println("3등 : 임꺽정 (" + p2_score + "점)");
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score > p3_score) {
			// 2, 1, 3
			System.out.println("1등 : 임꺽정 (" + p2_score + "점)");
			System.out.println("2등 : 홍길동 (" + p1_score + "점)");
			System.out.println("3등 : 윤봉길 (" + p3_score + "점)");
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score < p3_score) {
			// 2, 3, 1
			System.out.println("1등 : 임꺽정 (" + p2_score + "점)");
			System.out.println("2등 : 윤봉길 (" + p3_score + "점)");
			System.out.println("3등 : 홍길동 (" + p1_score + "점)");
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score > p2_score) {
			// 3, 1, 2
			System.out.println("1등 : 윤봉길 (" + p3_score + "점)");
			System.out.println("2등 : 홍길동 (" + p1_score + "점)");
			System.out.println("3등 : 임꺽정 (" + p2_score + "점)");
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score < p2_score) {
			// 3, 2, 1
			System.out.println("1등 : 윤봉길 (" + p3_score + "점)");
			System.out.println("2등 : 임꺽정 (" + p2_score + "점)");
			System.out.println("3등 : 홍길동 (" + p1_score + "점)");
		}
			
	}
}
