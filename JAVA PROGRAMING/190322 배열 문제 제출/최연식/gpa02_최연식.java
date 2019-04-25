package gpa02;

import java.util.Arrays;
import java.util.Scanner;

class gpa02 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		int i=0;
		double sum=0;
		double average=0;
		
		int[] arr=new int[10];
		String[] arr2=new String[10];
		
		for(i=0; i<arr.length; i++) {
			System.out.println((i+1)+"명의 이름을 입력하세요");
			String name=s.nextLine();
			
			System.out.println((i+1)+"명의 국어점수를 입력하세요");
			int gpa=s.nextInt();
			
			arr2[i]=name;
			arr[i]=gpa;
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.toString(arr));
			
			for(int a=0; a<i; a++) {
				System.out.println(arr[a]);
				
			}
			System.out.println("점수의 총합은 "+sum+"입니다");
			System.out.println("평균점수는 "+average+"입니다");
		}
	}

}
