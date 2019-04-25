import java.util.Scanner;

public class PrimeNumber {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("검사할 숫자를 입력해주세요");
		int inputNumber = scanner.nextInt();
		
		boolean isPrimeNumber = true;
		
		for (int i = 2; i < inputNumber; i++) {
			if (inputNumber % i == 0) {
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
