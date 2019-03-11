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
		
		System.out.println("화면에 숫자를 입력해주세요!");
		int inputNumber3 = s.nextInt();
		System.out.print("입력할 숫자는");
		System.out.println(inputNumber3+10);
		System.out.println("화면에 숫자를 입력해주세요!");
		int inpuNumber4 = s.nextInt();
		int inpuNumber5 = s.nextInt();
		System.out.print("입력할 숫자는");
		System.out.println(inpuNumber4*inpuNumber5);
		
		
		int inputNumber6 = s.nextInt();
		int Number1 = inputNumber6+10;
		System.out.printf("입력한 숫자 +10은 %d입니다", Number1);
		
		
		System.out.println("첫번쨰 숫자를 입력해주세요!!");
		int T1 = s.nextInt();
		System.out.println("두번쨰 숫자를 입력해주세요!!");
		int T2 = s.nextInt();
		int ST = T1+T2;
		System.out.printf("%d와 %d의 합은 %d 입니다",T1,T2,ST);
	}
}
