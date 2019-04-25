package javaproject;

import java.util.Scanner;

public class 박성민 {
	public static void main(String[] args) {
		System.out.println("학생1은 국어 점수를 입력하세요");
		int student1, student2, student3;
		Scanner s1 = new Scanner(System.in);
		student1 = s1.nextInt();

		System.out.println("학생2는 국어 점수를 입력하세요");
		Scanner s2 = new Scanner(System.in);
		student2 = s2.nextInt();
		System.out.println("학생3은 국어 점수를 입력하세요");
		Scanner s3 = new Scanner(System.in);
		student3 = s3.nextInt();

		if ("student1 > student2 && student2 > student3 && student1 >student3" != null) {
			System.out.println("학생1 :1등  학생2 : 2등  학생3 : 3등입니다");
		} else if ("student1 > student2 && student3 > student2 && student1 > student3" != null) {
			System.out.println("학생1 :1등  학생3 : 2등  학생2 : 3등입니다");
		}

		else if ("student2 > student1, && student1 > student3" != null) {
			System.out.println("학생2 :1등  학생1 : 2등  학생3 : 3등입니다");
		} else if ("student2 > student3, && student3 > student1" != null) {
			System.out.println("학생2 :1등  학생3 : 2등  학생1 : 3등입니다");
		}

		else if ("student3 > student1, && student1 > student2" != null) {
			System.out.println("학생3 :1등  학생1 : 2등  학생2 : 3등입니다");
		} else if ("student3 > student2, && student2 > student1" != null) {
			System.out.println("학생3 :1등  학생2 : 2등  학생1 : 3등입니다");

		}
	}
}
