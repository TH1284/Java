import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		
	
		
		System.out.println("중간고사 성적");
		Student[] student1 = new Student[100];
		Student[] student2 = new Student[100];
		for (int i = 0; i < student1.length; i++) {
			student1[i] = new Student();
		}
		Random2 rand = new Random2();
		for (int i = 0; i < student1.length; i++) {
			student1[i].name = (i + 1) + "번 학생";

			
			student1[i] = rand.randomStudent(student1[i]);
		}

		
		
		for (int i = 0; i < student1.length; i++) {
			student1[i].total = student1[i].kor + student1[i].eng + student1[i].math;
		}

		Arrays.sort(student1);

		for (int i = 0; i < student1.length; i++) {
			System.out.println(student1[i].print());
		}
		System.out.println();
		System.out.println("기말고사 성적");
		for (int i = 0; i < student2.length; i++) {
			student2[i] = new Student();	
		}
		
		for (int i = 0; i < student2.length; i++) {
			student2[i].name = (i + 1) + "번 학생";

			
			student2[i] = rand.randomStudent(student2[i]);
		}

		
		
		for (int i = 0; i < student2.length; i++) {
			student2[i].total = student2[i].kor + student2[i].eng + student2[i].math;
		}

		Arrays.sort(student2);

		for (int i = 0; i < student2.length; i++) {
			System.out.println(student2[i].print());
		}
		System.out.println();
		System.out.println("성적이 올라간 학생은");
		for (int i = 0; i < student2.length; i++) {
			if(student1[i].total < student2[i].total) {
				System.out.println(student2[i].print());
			}
	}
}}
