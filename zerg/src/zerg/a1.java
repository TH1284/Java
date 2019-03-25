package zerg;

import java.util.Scanner;

public class a1 {
	public void Numb() {
		Scanner n = new Scanner(System.in);
		
		System.out.println("숫자를 입력");
		int intputnumber1 = n.nextInt();
				
				boolean isa1 = true;
				for(int i = 2; i < intputnumber1; i++ ) {
					if(intputnumber1 % i == 0) {
						isa1 = false;
					}
				}
				if(isa1) {
					System.out.println("소수");
				}else {
					System.out.println("소수X");
				}
	}
}
