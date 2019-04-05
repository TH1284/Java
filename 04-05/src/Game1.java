import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		public static void main(String[] args) {
			Player player = new Player("폴리텍", 100);
			Enemy[] enemy = new Enemy[5];
			Enemy[0] = new Enemy("자동차", 100);
			Enemy[1] = new Enemy("나비", 100);
			Enemy[2] = new Enemy("잠자리", 100);
			Enemy[3] = new Enemy("참새", 100);
			Enemy[4] = new Enemy("자바", 100);
			
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("턴 진행은 엔터를 입력하세요.");
			for (int i = 0; i < 10000; i++) {
				scanner.nextLine();
				
				for(int j = 0; j < enemy.length; j++) {
					if (enemy[j].status()) {
						enemy[j].beUnferAttack();
					}
				}
				
				
				e1.beUnderAttak();
				if (e1.status()) {
					
				} else {
					System.out.println("적이 파괴되었습니다. 플레이어의 승리입니다.");
					break;
				}
				
				player.beUnderAttak();
				if (player.status()) {
					
				} else {
					System.out.println("당신은 졌습니다.");
				}
			}
		}
	}
