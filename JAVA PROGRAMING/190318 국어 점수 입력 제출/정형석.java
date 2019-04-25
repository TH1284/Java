import java.util.Scanner;

public class issue {
	public static void main(String[] args) {

		int 국어점수1;
		int 국어점수2;
		int 국어점수3;

		Scanner scan = new Scanner(System.in);
		국어점수1 = scan.nextInt();
		System.out.println(국어점수1);
		국어점수2 = scan.nextInt();
		System.out.println(국어점수2);
		국어점수3 = scan.nextInt();
		System.out.println(국어점수3);

		if (국어점수1 > 국어점수2 && 국어점수1>국어점수3 && 국어점수2 > 국어점수3) {
			System.out.println();
		}if (국어점수2 > 국어점수1 && 국어점수2 >국어점수3 && 국어점수3 > 국어점수1) {
			System.out.println();
		}if (국어점수3> 국어점수1 && 국어점수3 > 국어점수2 && 국어점수1 > 국어점수2) {
			System.out.println();
		}

	}

}
