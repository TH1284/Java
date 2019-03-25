

public class class2 {
	public void MakeSum(int startValue, int endValue) {
		int start = startValue;
		int sum = 0;
		int end = endValue;
		for(int i = start; i <= end ; i++) {
				sum = sum + i;
		}//end for
		
		System.out.println("시작값:" + start);
		System.out.println("종료값: " + end);
		System.out.println("총합: " + sum);
	}	
	}