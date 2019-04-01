package 연습용;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 연습용1 {
	String title;
	String description;
	String createDate;
	
	public void insertPost() {
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
