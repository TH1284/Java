import java.util.Arrays;
import java.util.Scanner;

public class Game_main {
	public static void main(String[] args) {

		Enemy[] horse = new Enemy[5];
		horse[0] = new Enemy("1번말");
		horse[1] = new Enemy("2번말");
		horse[2] = new Enemy("3번말");
		horse[3] = new Enemy("4번말");
		horse[4] = new Enemy("5번말");

		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10; i++) {
			scanner.nextLine();

			for (int j = 0; j < horse.length; j++) {
				if (horse[j].status()) {
					horse[j].beUnderAttak();
				}
			}
		}

		for (int j = 0; j < horse.length; j++) {
			if (horse[j].status()) {
//				
			}
			System.out.println(horse[j].name + "의 순위 : " + horse[j].myRank + "등");
		}
		scanner.close();
	}
}