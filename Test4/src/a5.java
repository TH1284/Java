import java.util.Scanner;
import java.util.Random;
public class a5 {
public static void main(String[] args) {
	
	int dice;
	
	Random ran = new Random();
	dice = ran.nextInt(6) + 1;
	System.out.println("�ֻ����� �����ּ���");
	
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
	} else if(dice == 6) {
		System.out.println("6");
	}
}
}
