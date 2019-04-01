package 연습용;

import java.util.Scanner;

public class 연습용3 {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	public void inputScore() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		this.name = scan.nextLine();
		
		System.out.println("국어점수 : ");
		String tmp = scan.nextLine();
		this.korScore = Integer.parseInt(tmp);
		
		System.out.println("영어점수 : ");
		tmp = scan.nextLine();
		this.engScore = Integer.parseInt(tmp);
		
		System.out.println("수학점수 : ");
		tmp = scan.nextLine();
		this.mathScore = Integer.parseInt(tmp);
		
		
	}
}
