package 연습합시다;

import java.util.Scanner;

public class 연습용4 {
	public static void main(String[] args) {
		연습용3 m = new 연습용3();
		Scanner scan1 = new Scanner(System.in);
		
		for (int i = 0; i<99999; i++) {
			System.out.println("메뉴선택: 1.입급, 2.입급+메세지, 3.종료");
			int menu1 = scan1.nextInt();
			if (menu1 == 1) {
				System.out.println("입금할 금액: ");
				int coin3 = scan1.nextInt();
				m.deposit3(coin3, "");
				
			}else if (menu1 == 2) {
				System.out.println("입급할 금액: ");
				int coin3 = scan1.nextInt();
				scan1.nextLine();
				String message3 = scan1.nextLine();
				m.deposit3(coin3, message3);
				
			}else if (menu1 == 3) {
				m.crash();
				break;
			}
		}
	}
}
