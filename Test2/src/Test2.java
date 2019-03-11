import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해주세요!");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("임력한 숫자는");
		System.out.print(inputNumber);
		
		System.out.println("화면에 한글를 입력해주세요!");
		String inputNumber2 = s.next();
		System.out.println("입력 한글");
		System.out.println(inputNumber2);
	}
}
