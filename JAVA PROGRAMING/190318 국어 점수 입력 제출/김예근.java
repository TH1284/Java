import java.util.Scanner;

public class 실습2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
System.out.println("1번 학생 점수 입력해주세요.");
		int grade1 = s.nextInt();
System.out.println("2번 학생 점수 입력해주세요.");
		int grade2 = s.nextInt();
System.out.println("3번 학생 점수 입력해주세요.");
		int grade3 = s.nextInt();
	
		while (true) 
			if ( grade1 <= 100 || grade2 <= 100 || grade3 <= 100)
				break;
		else  
				System.out.println("만점은 100점입니다. 다시 입력해주세요");
				System.out.println("만점은 100점입니다. 다시 입력해주세요 \n 1번 학생 점수 입력해주세요.");
				 grade1 = s.nextInt();
				System.out.println("2번 학생 점수 입력해주세요.");
				 grade2 = s.nextInt();
				System.out.println("3번 학생 점수 입력해주세요.");
				 grade3 = s.nextInt();
		
		
		
		
		if (grade1 > grade2 && grade1 > grade3 && grade2 > grade3)
			System.out.println("1번학생 1등 \n 2번학생 2등 \n 3번 학생 3등");
		else if (grade1 > grade2 && grade2 < grade3 && grade1 > grade3)
			System.out.println("1번학생 1등 \n 2번학생 3등 \n 3번 학생 2등");
		// 1번왕
		else if (grade2 > grade1 && grade2 > grade3 && grade1 > grade3)
			System.out.println("1번학생 2등 \n 2번학생 1등 \n 3번 학생 3등");
		else if (grade2 > grade1 && grade2 > grade3 && grade1 < grade3)
			System.out.println("1번학생 3등 \n 2번학생 1등 \n 3번 학생 2등");
		//2번왕
		else if (grade3 > grade1 && grade3 > grade2 && grade2 > grade1)
			System.out.println("1번학생 3등 \n 2번학생 2등 \n 3번 학생 1등");
		else if (grade3 > grade1 && grade3 > grade2 && grade1 > grade2)
			System.out.println("1번학생 2등 \n 2번학생 3등 \n 3번 학생 1등");
		//3번왕
	}
	
}