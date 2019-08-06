
public class RunClass {
	public static void main(String[] args) {
		final int GAME_START_NUMBER = 10;
		final int GAME_END_NUMBER = 50;
		String[] names = {"짱구", "영희", "철수", "길동"};
		Peoson[] players = new Peoson[names.length];
		for (int i = 0; i < names.length; i++) {
			players[i] = new Peoson(names[i]);
		}
		for (int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER);
		}
		players[1].gameStart();
	}
}
