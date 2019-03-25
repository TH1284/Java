package zerg;

public class ober {
	public static void main(String[] args) {
		zergling a = new zergling();
		System.out.println("6배수");
		for (int i =0; i < 100; i++) {
			int number1 = i + 1;
			boolean result = a.Rrr(number1);
			if(result) {
				System.out.println(" " + number1);
			}
		}
	}
}
