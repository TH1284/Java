import java.util.Random;
import java.util.Scanner;
public class iuhbikjijnj {

	public static void main(String[] args) {
	Random r = new Random();
	int randomValue = r.nextInt(100);
	System.out.print("임의의 값은:");
	System.out.println(randomValue);
	int randomValue2 = randomValue % 2;
	System.out.print("나머지 값은:");
	System.out.println(randomValue2);
	}
}
