import java.util.Random;
import java.util.Scanner;

public class a4 {
public static void main(String[] args) {
	
	int gawiBawBoCumputer;
	int gawBawBoUser;
	
	Random rand = new Random();
	gawiBawBoCumputer =  rand.nextInt(3);
	
	Scanner scan = new Scanner(System.in);
	System.out.print("������������ �Է����ּ���./n ������ 0,������ 1,���� 2 �Դϴ�");
	gawBawBoUser = scan.nextInt();
	
	if (gawiBawBoCumputer == gawBawBoUser) {
		System.out.print("�����ϴ�");
	}else if (gawiBawBoCumputer == 0 && gawBawBoUser == 1) {
		System.out.println("����ڰ� �̰���ϴ�");
	}else if (gawiBawBoCumputer == 0 && gawBawBoUser == 2) {
		System.out.println("��ǻ�Ͱ� �̰���ϴ�");
	}else if (gawiBawBoCumputer == 1 && gawBawBoUser == 0) {
		System.out.println("��ǻ�Ͱ� �̰���ϴ�");
	}else if (gawiBawBoCumputer == 1 && gawBawBoUser == 2) {
		System.out.println("����ڰ� �̰���ϴ�");
	}else if (gawiBawBoCumputer == 2 && gawBawBoUser == 0) {
		System.out.println("����ڰ� �̰���ϴ�");
	}else if (gawiBawBoCumputer == 2 && gawBawBoUser == 1) {
		System.out.println("��ǻ�Ͱ� �̰���ϴ�");
	}
}
}