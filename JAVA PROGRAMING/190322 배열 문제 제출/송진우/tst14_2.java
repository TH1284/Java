package tst14;

import java.util.Arrays;
import java.util.Scanner;

public class tst14_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int i = 0;
		double sum = 0;
		double average = 0;
		int[ ] arr= new int[10];
		String[ ] arr2= new String[10];
		for (i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "명의 이름을 입력해주세요.");
			String name = scan2.nextLine();
			
			System.out.println((i + 1) + "명의 국어점수를 입력해주세요.");
			int grade = scan.nextInt();
			
			arr2[i] = name;
			arr[i] = grade;
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.toString(arr));

//		for(int a=0; a<i; a++) {
//		System.out.print(arr[a]);
//		}

			sum = sum + arr[i];
			average = sum / arr.length;
		}
		System.out.println("점수의 총합은 " + sum + " 입니다.");
		System.out.println("평균 점수는 " + average + " 입니다.");
	}
}
