import java.util.Arrays;

public class Arrangement3 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,};
		int [] temp = {1,2,0,0,0};
		
		System.arraycopy(arr, 2, temp, 2,3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}
}
