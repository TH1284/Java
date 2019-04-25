import java.util.Scanner;

public class Grade1 {
	public static void main(String[] args) {
		int p1_score;
		int p2_score;
		int p3_score;
		
		Scanner scan = new Scanner(System.in);
		
		p1_score = scan.nextInt();
		p2_score = scan.nextInt();
		p3_score = scan.nextInt();
		
		if (p1_score > p2_score && p1_score > p3_score && p2_score > p3_score) {
			// 1, 2, 3
		} else if (p1_score > p2_score && p1_score > p3_score && p2_score < p3_score) {
			// 1, 3, 2
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score > p3_score) {
			// 2, 1, 3
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score < p3_score) {
			// 2, 3, 1
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score > p2_score) {
			// 3, 1, 2
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score < p2_score) {
			// 3, 2, 1
		}
			
	}
}
