package 연습합시다;

import java.util.Scanner;

public class 연습용6 {
public static void main(String[] args) {
	연습용5 mo = new 연습용5();
	Scanner sc = new Scanner(System.in);
	
	for (int i = 0; i < 99999; i ++) {
		System.out.println("메뉴를 정해주세요: 1.입금, 2.입급+메세지, 3.종료");
		int menu = sc.nextInt();
		if (menu == 1) {
			System.out.println("입금할 금액을 입력해 주세요.");
			int coin5 = sc.nextInt();
			mo.deposit5(coin5, "");
			
		}else if (menu == 2) {
			System.out.println("입금할 금액을 입력해 주세요.");
			int coin5 = sc.nextInt();
			System.out.println("메세지를 입력해 주세요.");
			sc.nextLine();
			String message5 = sc.nextLine();
			mo.deposit5(coin5, message5);
			
		}else if (menu == 3) {
			mo.crash1();
			break;
		}
	}
}
}
