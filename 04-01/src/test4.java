import java.text.SimpleDateFormat;
import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		test3 post =new test3();
		post.inserttest3();
	
		
		System.out.println("" + post.title + ","+ post.description + "," + post.createDate);

	}
}
