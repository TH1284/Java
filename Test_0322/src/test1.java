
public class test1 {
public static void main(String[] args) {
	int total = 0;
	int eventotal = 0;
	int oddtotal = 0;
	
	for (int i = 0; i < 100; i++) {
		int number = i+1;
		total = total + number;
		
		if (number % 2 == 0) {
			eventotal = eventotal + number;
	} else {
		oddtotal = oddtotal + number;
	}
	}
	System.out.println("촣합은" + total);
	System.out.println("홀수 촣합은" + eventotal);
	System.out.println("짝수 촣합은" + oddtotal);
	
	int[] arr = {1,2,3,4,5};
	
	for(int i=0; i< arr.length; i++) {
		System.out.print(arr[i]);
		System.out.print(" ");
	}
	System.out.println();
	int[] arr2 = arr;
	
	int[] arr3 = arr2;
	
	arr3[0] =10;
	
	for (int i = 0; i < arr.length; i++) {
		
	System.out.print(arr[i]);
	System.out.print(" ");
	}
}
}
