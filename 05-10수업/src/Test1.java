import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("D");
		set.add("E");
		set.add(new String("A"));
		System.out.println(set);
		
		
		
	}
}
