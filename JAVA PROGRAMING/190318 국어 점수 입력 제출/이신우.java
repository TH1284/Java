import java.util.Scanner;

public class 이신우 {
	
	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		int 국어점수A;
		int 국어점수B;
		int 국어점수C;
		
//		국어점수A = A.nextInt();
//		국어점수B = A.nextInt();
//		국어점수C = A.nextInt();
		
		System.out.println("첫 번째 점수를 입력하세요.");
		국어점수A = A.nextInt();
		System.out.println("첫번째 점수는 "+ 국어점수A+" 입니다.");
		System.out.println("두 번째 점수를 입력하세요.");
		국어점수B = A.nextInt();
		System.out.println("첫번째 점수는 "+ 국어점수B+" 입니다.");
		System.out.println("세 번째 점수를 입력하세요.");
		국어점수C = A.nextInt();
		System.out.println("첫번째 점수는 "+ 국어점수C+" 입니다.");
		
		if(국어점수A > 국어점수B && 국어점수A > 국어점수C && 국어점수B > 국어점수C) {    // A > B > C
			
			System.out.println("1등은 : A \n2등은 : B \n3등은 : C");
			
		}else if(국어점수A > 국어점수B && 국어점수A > 국어점수C && 국어점수B < 국어점수C){   // A > C > B
			
			System.out.println("1등은 : A \n2등은 : C \n3등은 : B");
			
		}else if(국어점수B > 국어점수A && 국어점수B > 국어점수C && 국어점수A < 국어점수C) {  // B > C > A
			
			System.out.println("1등은 : B \n2등은 : C \n3등은 : A");
			
		}else if(국어점수B > 국어점수A && 국어점수B > 국어점수C && 국어점수A > 국어점수C) {  // B > A > C
			
			System.out.println("1등은 : B \n2등은 : A \n3등은 : C");
			
		}else if(국어점수C > 국어점수A && 국어점수C > 국어점수B && 국어점수A > 국어점수B) {  // C > A > B
			
			System.out.println("1등은 : C \n2등은 : A \n3등은 : B");
			
		}else if(국어점수C > 국어점수A && 국어점수C > 국어점수B && 국어점수A < 국어점수B) {  // C > B > A
			
			System.out.println("1등은 : C \n2등은 : B \n3등은 : A");
			
		}else if(국어점수A == 국어점수B && 국어점수A < 국어점수C && 국어점수B < 국어점수C) {    // A == B < C
			
			System.out.println("1등은 : C \n 2등은: A와 B ( 동점입니다 ) ");
			
		}else if(국어점수A == 국어점수B && 국어점수A > 국어점수C && 국어점수B > 국어점수C) {    // A == B > C
			
			System.out.println("1등은 : A와 B ( 동점입니다 ) \n 2등은: C  ");
			
		}else if(국어점수B == 국어점수C && 국어점수A > 국어점수C && 국어점수A > 국어점수B) {    // B == C < A
			
			System.out.println("1등은 : A \n 2등은: B와 C ( 동점입니다 )");
			
		}else if(국어점수B == 국어점수C && 국어점수A < 국어점수C && 국어점수A < 국어점수B) {    // B == C > A
			
			System.out.println("1등은 : B와 C ( 동점입니다 ) \n2등은 : A ");
			
		}else if(국어점수A == 국어점수C && 국어점수A < 국어점수B && 국어점수C < 국어점수B) {    // A == C < B
			
			System.out.println("1등은 : B \n 2등은 : A와 C ( 동점입니다 )");
			
		}else if(국어점수A == 국어점수C && 국어점수A > 국어점수B && 국어점수C > 국어점수B) {    // A == C > B
			
			System.out.println("1등은 : A와 C ( 동점입니다 ) \n 2등은 : B");
			
		}
		
		else{
			
			System.out.println("A B C 모두 점수가 같습니다.");    // A == B == C
			
		}
		
	}

}
