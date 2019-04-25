import java.util.Scanner;
public class 송진우 extends Dita {
	public static void main(String[] args) {
		int 국어점수;
		System.out.println("점수를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		국어점수 = scan.nextInt();
		if (국어점수 == 100 || 국어점수 >= 95) {
			System.out.println("1등입니다.");

		} else if (국어점수 == 90 || 국어점수 >= 80) {
			System.out.println("2등입니다.");

		} else if (국어점수 == 70 || 국어점수 >= 60) {
			System.out.println("3등입니다.");

		} else if (국어점수 <= 50) {
			System.out.println("낙제입니다");
		}
	}
}
