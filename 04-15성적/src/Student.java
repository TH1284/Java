
public class Student implements	Comparable<Student> {
	String name;
	int kor;
	int eng;
	int math;
	int total;
//  1번문제 ----------------------------여기까지
	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);// 숫자를 문자로 바꿔줌
		return tmp;
	}
	@Override
	public int compareTo(Student o) {
		if (this.total < o.total) {
			return -1;
		}
		else if (this.total > o.total) {
			return 1;
		}
		return 0;
	}
}

// %d -> "1"   %03d -> "001"

// 객체와 객체를 비교를 할수있는 기준을 만든다.
// 인터페이스: 외부에서 만들어준 규칙을 추가하기(비교를 위해)
// 