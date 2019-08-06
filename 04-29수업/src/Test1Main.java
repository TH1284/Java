import java.util.Arrays;

public class Test1Main {
	public static void main(String[] args) {
		String[] names = {"1","2","3","4","5","6","7","8","9","10"};
		System.out.println(Arrays.toString(names));
		Test1[] student =new Test1[names.length];
		
		for(int i = 0; i<names.length; i++) {
			student[i] = new Test1(names[i]);
			
		}
		for(int i=0; i < student.length; i++) {
			if(student[i].middleScore < student[i].finalScore) {
				System.out.println(student[i]);
			}
		}
	}
}
