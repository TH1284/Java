import java.util.Random;
import java.util.Scanner;

public class Dress {
	int price = 0;
	String size;
	String name = "";
	Dress(String name, String size){
		this.name = name;
		this.size = size;
	}
	
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	public void randomPrice() {
		this.price = r.nextInt((400)+100)*100;
		
	}
	
	
}
