import java.text.SimpleDateFormat;
import java.util.Scanner;

public class test3 {
	String title;
	String description;
	String createDate;
	
	public static void main(String[] args) {
		test3 post = new test3();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제목");
		this.title = scan.nextLine();
		System.out.println("내용");
		this.description = scan.nextLine();
		
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.createDate = dayTime.format(new Date(time));
}
}