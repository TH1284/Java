import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("A의 점수를 입력하세요");
		Scanner p1 = new Scanner(System.in);
		int scoreA = p1.nextInt();		
		System.out.println("B의 점수를 입력하세요");
		int scoreB = p1.nextInt();	
		System.out.println("C의 점수를 입력하세요");
		int scoreC = p1.nextInt();	
		System.out.println("등수대로 표시합니다");
		
		
		if (scoreA >= scoreB && scoreB >= scoreC) {
		System.out.print("A:" + scoreA + " ");
		System.out.print("B:" + scoreB + " ");
		System.out.print("C:" + scoreC + " ");
		
		} else if (scoreA >= scoreC && scoreC >= scoreB) {
		System.out.print("A:" + scoreA + " ");
		System.out.print("C:" + scoreC + " ");
		System.out.print("B:" + scoreB + " ");
		
		} else if (scoreB >= scoreA && scoreA >= scoreC) {
		System.out.print("B:" + scoreB + " ");
		System.out.print("A:" + scoreA + " ");
		System.out.print("C:" + scoreC + " ");
		
		} else if (scoreB >= scoreC && scoreC >= scoreA) {
		System.out.print("B:" + scoreB + " ");
		System.out.print("C:" + scoreC + " ");
		System.out.print("A:" + scoreA + " ");
		
		} else if (scoreC >= scoreA && scoreA >= scoreB) {
		System.out.print("C:" + scoreC + " ");
		System.out.print("A:" + scoreA + " ");
		System.out.print("B:" + scoreB + " ");
		
		} else if (scoreC >= scoreB && scoreB >= scoreA) {
		System.out.print("C:" + scoreC + " ");
		System.out.print("B:" + scoreB + " ");
		System.out.print("A:" + scoreA + " ");
		}
	}
}