import java.util.HashMap;
import java.util.Map;

public class RunningClass {
	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(0, "hello");
//		map.put(0, "aaaa");
//		map.put(1, "ccbcb");
//		System.out.println(map);
		
		HashMap<String, String> map = new HashMap<String, String>();//순서화x
		map.put("name", "hello");
		map.put("name", "aaaa");
		map.put("score", "100");
		System.out.println(map);
		
		
		for(Map.Entry<String, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
	}
}
