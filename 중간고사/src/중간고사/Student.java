package 중간고사;

public class Student implements	Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	static final int MOVE_FORWARD = -1;
	final int MOVE_BACKWARD = 1;

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);
		return tmp;
	}
	@Override
	public int compareTo(Student o) {
		if (this.total < o.total) {
			return Student.MOVE_FORWARD; 
		}
		else if (this.total > o.total) {
			return MOVE_BACKWARD;
		}
		return 0;
	}
}
	
