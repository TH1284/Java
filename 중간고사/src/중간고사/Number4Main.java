package 중간고사;

public class Number4Main {
public static void main(String[] args) {
	Number4[] n4 = new Number4[2];
	n4[0] = new Number4("짱구");
	n4[1] = new Number4("철수");
	n4[2] = new Number4("유리");
	
	for (int i = 1; i<=200; i++){
	    
	    String str = i + "";
	    for(int j = 0; j < n4.length; j++) {
	     System.out.println(str);
	      if(n4[j] == 3 || n4[j] == 6 || n4[j] == 9){
	        System.out.println("짝");
}
}
