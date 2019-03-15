import java.util.Scanner;

public class Tt {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("숫자를 입력");
	int Number1 = s.nextInt();
	int Number2 = s.nextInt();
	int Number3 = s.nextInt(Number1*Number2);
	System.out.println("Nunber1 곱하기 Number2 는");
	System.out.println(Number3);	
}
}
