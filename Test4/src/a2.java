import java.util.Random;
public class a2 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		
		int number1 = rand1.nextInt(100);
		
		System.out.println("���� ����:" + number1);
		System.out.println("������:" + (number1 % 2));
		
		if(number1 % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		} else {
			System.out.println("¦���Դϴ�");
		}
	}
}
