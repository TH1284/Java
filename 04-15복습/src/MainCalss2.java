import java.util.Arrays;
import java.util.Random;

public class MainCalss2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Student2[] student = new Student2[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student2();
		}
		for (int i =0; i < student.length; i++) {
			student[i].name = (i + 1) +"번 학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		System.out.println(Arrays.toString(student));
	}
}
