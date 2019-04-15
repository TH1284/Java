import java.util.Random;

public class Random10 extends Random{
	int[] resultArr = new int[10];
	public int[] nextInt2(int range) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[10];
		for (int i = 0; i < resultArr.length; i++) {
//			arr[i] = super.nextInt(range);
			resultArr[i] = super.nextInt(range);
		}
//		return arr;
	}
}

