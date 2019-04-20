import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
//Random rand = new Random();
		
//		String a ="abc";
//		String b = a;
//		a.hashCode();
//		b = "cdf";
//		System.out.println(b.hashCode());
	
		
		
		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		Random2 rand = new Random2();
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
//			student[i].kor = rand.nextInt(101);
//			student[i].eng = rand.nextInt(101);
//			student[i].math = rand.nextInt(101);
			
			student[i] = rand.randomStudent(student[i]);
		}
// 여기까지 1번문제	-------------------------------
		
		
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i; j < student.length; j++) {
//				if (student[i].total < student[j].total) {
//					Student tmp = student[i];
//					student[i] = student[j];
//					student[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(student); //순위를 나타내기 위해 사용    //implements(규칙서)라는 규칙을 적용시킨다
//		순위를 오름차순에서 바꾸기 위해서 
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
	}
}
