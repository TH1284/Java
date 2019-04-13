import java.util.Scanner;

public class Rungame {
	public static void main(String[] args) {
		Player[] player = new Player[1];
	
		player[0] = new Player4();
		
		Enemy[] enemy = new Enemy[1];
		
		enemy[0] = new Enemy4();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n게임 시작\n\n턴 진행 시 엔터 입력");
		for(int turn = 0; turn < 10; turn++) {
			scanner.nextLine();
			for(int i = 0; i < player.length; i++) {
				if (player[i].status()) {
					int attackPower = player[i].getAttackPower();
					for(int j = 0; j < enemy.length; j++) {
						enemy[j].beUnderAttak(attackPower);
					}
				}
			}
			for(int i = 0; i < enemy.length; i++) {
				if (enemy[i].status()) {
					int attackPower = enemy[i].getAttackPower();
					for(int j = 0; j < player.length; j++) {
						player[j].beUnderAttak(attackPower);
					}
				}
			}
		}
		System.out.println("\n\n결과 출력");
		int playerCount = 0;
		for(int i = 0; i < player.length; i++) {
			if(player[i].status()) {
				playerCount++;
				System.out.println(player[i].name + "은(는) 살아있습니다. hp " + player[i].hp);
			} else {
				System.out.println(player[i].name + "은(는) 죽었습니다.");
			}
		}
		System.out.println("플레이어 생존 수 : " + playerCount + "\n");
		int enemyCount = 0;
		for(int i = 0; i < enemy.length; i++) {
			if(enemy[i].status()) {
				enemyCount++;
				System.out.println(enemy[i].name + "은(는) 살아있습니다. hp " + enemy[i].hp);
			} else {
				System.out.println(enemy[i].name + "은(는) 죽었습니다.");
			}
		}
		System.out.println("에너미 생존 수 : " + enemyCount + "\n");
	}
	}

