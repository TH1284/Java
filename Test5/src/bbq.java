import java.util.Random;
import java.util.Scanner;

public class bbq {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random r = new Random();
//		int sum = 0;
//		for (int i = 0; i<3; i++) {
//			sum += scan.nextInt();
//		}
//		System.out.println(sum);
//		System.out.println((double)sum / 3);
//	}
	int totalScore = 0;
	for (int i = 0; i < 3; i++) {
		int randNumber = r.nextInt(101);
		totalScore = totalScore + randNumber;
	}
	
	System.out.println("총점은:" + totalScore + "입니다");
	
	double averageScore= 0;
	averageScore = (double)totalScore / 8;
	System.out.println("평균은" + averageScore + "입니다");
	}	
}

