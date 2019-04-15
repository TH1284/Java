
public class Student2 {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "총점 : " + this.total + "(국어" + this.kor + ", 영어" + this.eng + ", 수학" + this.math + ")";
	}
}
