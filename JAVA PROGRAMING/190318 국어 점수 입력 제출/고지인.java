package java6;

import java.util.Scanner;

//#3명의 국어점수를 입력받아서 등수대로 표시해보기

public class 고지인 {
	public static void main(String[] args) {
		System.out.println("화면에 a의 국어점수를 입력해주세요.");
		Scanner a = new Scanner(System.in);
		int number_a = a.nextInt();
		
		System.out.println("화면에 b의 국어점수를 입력해주세요.");
		Scanner b = new Scanner(System.in);
		int number_b = b.nextInt();
		
		System.out.println("화면에 c의 국어점수를 입력해주세요.");
		Scanner c = new Scanner(System.in);
		int number_c = c.nextInt();
		
		if(number_a > number_b && number_b > number_c) ;
			System.out.println("1등 : a /n/ 2등 : b /n/ 3등 : c");
		
			
		}
		
	}
