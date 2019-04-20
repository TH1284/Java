import java.util.Random;

public class Random2 extends Random{
	public Student randomStudent(Student target) {// targer에 주소만 들어온다
		target.kor = this.nextInt(101);
		target.eng = this.nextInt(101);
		target.math = this.nextInt(101);
		return target;
		
	}

}
//주소를 받아서 사용하기 때문에 return이 필요가 없다.