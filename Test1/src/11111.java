import java.util.Random;

public class dustmq {
	public static void main(String[] args) {

		int dice;

		Random r1 = new Random();
		dice = r1.nextInt(6) + 1;
		System.out.println("�ֻ����� ��������");

		if (dice == 1) {
			System.out.println("�۸�");
		} else if (dice == 2) {
			System.out.println("�߿�");
		} else if (dice == 3) {
			System.out.println("3");
		} else if (dice == 4) {
			System.out.println("4");
		} else if (dice == 5) {
			System.out.println("5");
		} else if (dice == 6) {
			System.out.println("6");
		}

		switch (dice) {
		case 1:
			System.out.println("�۸�");
			break;
		case 2:
			System.out.println("�߿�");
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		default:
			System.out.println(6);
		}
	}
}
