import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 ���ڸ� �Է����ּ���!");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("�ӷ��� ���ڴ�");
		System.out.print(inputNumber);
		
		System.out.println("ȭ�鿡 �ѱ۸� �Է����ּ���!");
		String inputNumber2 = s.next();
		System.out.println("�Է� �ѱ�");
		System.out.println(inputNumber2);
		
		System.out.println("ȭ�鿡 ���ڸ� �Է����ּ���!");
		int inputNumber3 = s.nextInt();
		System.out.print("�Է��� ���ڴ�");
		System.out.println(inputNumber3+10);
		System.out.println("ȭ�鿡 ���ڸ� �Է����ּ���!");
		int inpuNumber4 = s.nextInt();
		int inpuNumber5 = s.nextInt();
		System.out.print("�Է��� ���ڴ�");
		System.out.println(inpuNumber4*inpuNumber5);
	}
}
