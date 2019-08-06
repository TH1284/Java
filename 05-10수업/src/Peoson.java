
public class Peoson {
	String name;
	Peoson[] players;
	int position = 0;
	int startNumber = 0;
	int endNumber = 0;
	int sayNumber = 0;
	Peoson(String name) {
		this.name = name;
	}
	public void readyGame(Peoson[] players, int position, int startNumber, int endNumber) {
		this.players = players;
		this.position = position;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	public void sayNumber() {
//		int prevPositon = this.position - 1;
//		if (prevPositon < 0) {
//			prevPositon = this.players.length - 1;
//		}
		this.sayNumber = this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber + 1;
		System.out.println(this.name + " say " + this.sayNumber);
		int nextPosition = (this.position+1) % this.players.length;
		if(this.sayNumber < this.endNumber) {
			this.players[nextPosition].sayNumber();
		}
//		this.sayNumber = this.players[prevPositon].sayNumber + 1;
//		System.out.println(this.name + " say " + this.sayNumber);
	}
	public void gameStart() {
		this.players[this.players.length -1].sayNumber = this.startNumber - 1;
		this.sayNumber();
	}
}
