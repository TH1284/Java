// 3명의 국어점수를 입력받아서  순서대로 출력

import java.util.Scanner;

public class Edu04 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int stuScore01 = 0;
		int stuScore02 = 0;
		int stuScore03 = 0;
		
		System.out.println("첫번째 학생의 국어 점수를 입력해 주세요.");
		stuScore01 = s.nextInt();
		
		System.out.println("두번째 학생의 국어 점수를 입력해 주세요.");
		stuScore02 = s.nextInt();
		
		System.out.println("세번째 학생의 국어 점수를 입력해 주세요.");
		stuScore03 = s.nextInt();
		
		if (stuScore01 > stuScore02 && stuScore01 > stuScore03) {
			if ( stuScore02 > stuScore03) {
				System.out.printf("1등은 첫번째학생 %d점 2등은 두번째학생 %d점 3등은 세번째학생 %d점 \n",stuScore01, stuScore02, stuScore03);
			} else if (stuScore03 > stuScore02) {
				System.out.printf("1등은 첫번째학생 %d점 2등은 세번째학생 %d점 3등은 두번째학생 %d점 \n", stuScore01, stuScore03, stuScore02);
			} else {
				System.out.println("동점은 배열 정렬 배운뒤 ㅠㅠ");
			}
		} else if (stuScore02 > stuScore01 && stuScore02 > stuScore03) {
			if ( stuScore01 > stuScore03) {
				System.out.printf("1등은 두번째학생 %d점 2등은 첫번째학생 %d점 3등은 세번째학생 %d점 \n", stuScore02, stuScore01, stuScore03);
			} else if (stuScore03 > stuScore01) {
				System.out.printf("1등은 두번째학생 %d점 2등은 세번째학생 %d점 3등은 첫번째학생 %d점  \n", stuScore02, stuScore03, stuScore01);
			} else {
				System.out.println("동점은 배열 정렬 배운뒤 ㅠㅠ");
			}
		} else if (stuScore03 > stuScore01 && stuScore03 > stuScore02) {
			if ( stuScore01 > stuScore02) {
				System.out.printf("1등은 세번째학생 %d점 2등은 첫번째학생 %d점 3등은 두번째학생 %d점  \n", stuScore03, stuScore01, stuScore02);
			} else if (stuScore02 > stuScore01) {
				System.out.printf("1등은 세번째학생 %d점 2등은 두번째학생 %d점 3등은 첫번째학생%d점  \n", stuScore03, stuScore02, stuScore01);
			}
		} else {
			System.out.println("동점은 배열 정렬 배운뒤 ㅠㅠ");
		}
	}
}
