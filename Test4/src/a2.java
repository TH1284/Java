import java.util.Random;
public class a2 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		
		int number1 = rand1.nextInt(100);
		
		System.out.println("랜덤 숫자:" + number1);
		System.out.println("나머지:" + (number1 % 2));
		
		if(number1 % 2 == 1) {
			System.out.println("홀수입니다");
		} else {
			System.out.println("짝수입니다");
		}
	}
}
