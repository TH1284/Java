import java.util.Scanner;

public class LoopFor_190318 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score_1 = 0;
		int score_2 = 0;
		int score_3 = 0;
		boolean check_score = true;
		
		System.out.println("Plz input 3 students score");
		
		
		//student 1 score range check
		while(check_score) {
						
			System.out.print("student 1 : ");
			score_1 = s.nextInt();
			
			if(score_1 > 100 || score_1 < 0) {
				System.out.println("score lange is [0:100]");
				check_score = true;
			}
			else
				check_score = false;
		}
		
		//student 2 score range check
		check_score = true;
		while(check_score) {	
			System.out.print("student 2 : ");
			score_2 = s.nextInt();
			
			if(score_2 > 100 || score_2 < 0) {
				System.out.println("score lange is [0:100]");
				check_score = true;
			}
			else
				check_score = false;
		}
		
		//student 3 score range check
		check_score = true;
		while(check_score) {
			System.out.print("student 3 : ");
			score_3 = s.nextInt();
			
			if(score_3 > 100 || score_3 < 0) {
				System.out.println("score lange is [0:100]");
				check_score = true;
			}
			else
				check_score = false;			
		}
		
		// set top, mid, row
		int top, middle, row;
		String topStudent, midStudent, rowStudent;
		
		
		//mechanism
		if(score_1 >= score_2) {
			if(score_1 >= score_3) {
				top = score_1;
				topStudent = "student 1";
				if(score_2 >= score_3) { //1 >= 2 >= 3
					middle = score_2;
					midStudent = "student 2";
					
					row = score_3;
					rowStudent = "student 3";
				}
				else { //1 >= 3 >= 2
					middle = score_3;
					midStudent = "student 3";
					
					row = score_2;
					rowStudent = "student 2";
				}
			}
			else { //3 >= 1 >= 2
				top = score_3;
				topStudent = "student 3";
				
				middle = score_1;
				midStudent = "student 1";
				
				row = score_2;
				rowStudent = "student 2";
			}
		}
		else {
			if(score_1 >= score_3) { //2 >= 1 >= 3
				top = score_2;
				topStudent = "student 2";
				
				middle = score_1;
				midStudent = "student 1";
				
				row = score_3;
				rowStudent = "student 3";
			}
			else { //2 >= 3 >= 1
				if(score_2 >= score_3) {
					top = score_2;
					topStudent = "student 2";
					
					middle = score_3;
					midStudent = "student 3";
					
					row = score_1;
					rowStudent = "student 1";
				}
				else { //3 >= 2 >= 1
					top = score_3;
					topStudent = "student 3";
					
					middle = score_2;
					midStudent = "student 2";
					
					row = score_1;
					rowStudent = "student 1";
				}
			}
		}
		
		
			
		System.out.printf("top		: %d \n"
				                + "middle	: %d \n"
				                + "row		: %d \n", 
									top, middle, row);
		System.out.println("top		: " +  topStudent);
		System.out.println("middle	: " +  midStudent);
		System.out.println("row		: " +  rowStudent);

		
	}
}
