import java.util.Scanner;

public class F4 {
public static void main(String[] args) {
	F3 a1 = new F3();
	
	Scanner scanner = new Scanner(System.in);
	
	for (int i = 0; i < 2; i++) { 
	System.out.println("임력할 금액: ");
	int coin = scanner.nextInt();
	System.out.println("메세지: ");
	scanner.nextLine();
	String message = scanner.nextLine();
	a1.deposit1(coin, message);
	if (message.equals("crash")) {
		break;
	}

}	
//	a1.deposit1(100, "");
//	a1.deposit1(100, "");
	
}
}
