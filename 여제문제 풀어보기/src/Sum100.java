
public class Sum100 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <101; i++) {
			if(i%2==1) {
				sum = sum + i;
			}
			
		}
		System.out.println(sum);
		int sum2 = 0;
		for(int j = 0; j < 101; j++) {
			if(j%2 == 0) {
				sum2 = sum2 + j;
			}
		}
		System.out.println(sum2);
	}
}
