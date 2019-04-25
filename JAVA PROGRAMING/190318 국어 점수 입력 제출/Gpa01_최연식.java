import java.util.Scanner;

public class Gpa01 {
	public static void main(String[] args) {
		
		int 국어점수;
				
		System.out.println("국어점수를 입력해주세요");
		Scanner s=new Scanner(System.in);
		국어점수=s.nextInt();
				
		if(국어점수==100 || 국어점수>=90 ) {
			System.out.println("A학점입니다");
		}else if(국어점수==89 || 국어점수>=80 ) {
			System.out.println("B학점입니다");
		}else if(국어점수==79 || 국어점수>=70  ) {
			System.out.println("C학점입니다");
		}else if(국어점수==69 || 국어점수>=60  ) {
			System.out.println("D학점입니다");
		}else if(국어점수==59 || 국어점수>=50  )
			System.out.println("F학점입니다");
		}
	
	}


