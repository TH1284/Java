import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
		System.out.println("국어점수를 입력해 주세요.");
		int aNumber = s.nextInt();
		System.out.println("국어점수를 입력해 주세요.");
		int bNumber = s.nextInt();
		System.out.println("국어점수를 입력해 주세요.");
		int cNumber = s.nextInt();
	
	if (aNumber > bNumber && aNumber > cNumber) {
		System.out.println("1등");
	} else if (bNumber > aNumber && bNumber > cNumber) {
		System.out.println("1등"); 
	} else if (cNumber > aNumber && cNumber > bNumber) {
		System.out.println("1등"); 
	} else if (bNumber > cNumber && aNumber > bNumber ) {
		System.out.println("2등");
	} else if (bNumber > cNumber && aNumber > bNumber ) {
		System.out.println("2등");
	} else if (cNumber > aNumber && bNumber > cNumber ) {
		System.out.println("2등");
	} else if (aNumber < cNumber && aNumber < bNumber ) {
		System.out.println("3등");
	} else if (bNumber < cNumber && aNumber > bNumber ) {
		System.out.println("3등");
	} else if (aNumber > cNumber && cNumber < bNumber ) {
		System.out.println("3등");	
	}
	}
}

