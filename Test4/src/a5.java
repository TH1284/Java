import java.util.Random;

public class a5 {
	public static void main(String[] args) {
		
		int dice;
		Random ran = new Random(100);
		dice = ran.nextInt(6) + 1;
		dice = dice % 6;
		dice = dice +1;
		System.out.println("林荤困甫 奔妨林技夸");

		if (dice == 1) {
			System.out.println("港港");
		} else if (dice == 2) {
			System.out.println("具克");
		} else {
		System.out.println(dice);
	}
	}
}