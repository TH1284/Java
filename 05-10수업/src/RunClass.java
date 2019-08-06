
public class RunClass {
	public static void main(String[] args) {
		final int GANE_START_NUMBER = 1;
		final int GANE_END_NUMBER = 100;
		String[] names = {"짱구", "영희", "철수"};
		Peoson[] players = new Peoson[names.length];
		for (int i = 0; i < names.length; i++) {
			players[i] = new Peoson(names[i]);
		}
		for (int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i, GANE_START_NUMBER, GANE_END_NUMBER);
		}
		players[0].gameStart();
		
	}
}
