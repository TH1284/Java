
public class oneTwo {
	public static void main(String[] args) {
		int sum = 0;
		int sum1= 0;
		int sum2 =0;
		for(int i=1; i<101; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
		for( int i=0; i<101; i++) {
			if(i%2 ==1) {
				sum1 = sum1+i;
			}else if (i%2 == 0) {
				sum2 =sum2+i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
