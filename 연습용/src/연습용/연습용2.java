package 연습용;

public class 연습용2 {
public static void main(String[] args) {
	연습용1 post = new 연습용1();
	post.insertPost();
	
	System.out.println("" + post.title + "," + post.description+ "," + post.createDate);
	
	
}
}
