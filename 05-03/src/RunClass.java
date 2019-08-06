import java.util.HashMap;
import java.util.Map;

public class RunClass {
	public static void main(String[] args) {
		String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };
//		ArrayList<Student> student = new ArrayList<Student>();
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], new Student(names[i]));
		}
		
		for (Map.Entry<String, Student> item : map.entrySet()) {
			Student one = item.getValue();
			if (one.middleScore < one.finalScore) {
				System.out.println(one);
			}
		}
		
//		Student one = map.get("둘리");
//		System.out.println(map.get("둘리"));

//		for (int i = 0; i < names.length; i++) {
//			student.add(new Student(names[i]));
//		}
//		Student[] arr = new Student[student.size()];
//		student.toArray(arr);
//		System.out.println(arr[0]);
		
//		student.forEach(new Consumer<Student>() {
//			@Override
//			public void accept(Student t) {
//				if (t.middleScore < t.finalScore) {
//					System.out.println(t);
//				}
//			}
//		});
		
		
	}
}
