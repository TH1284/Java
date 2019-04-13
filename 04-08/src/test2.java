
public class test2 extends test1{
	public void printResult() {
		super.printResult();
		System.out.println("더하기 결과:" + (this.number1 + this.number2));
		System.out.println("빼기 결과:" + (this.number1 - this.number2));
		System.out.println("곱하기 결과:" + (this.number1 * this.number2));
		System.out.println("나누기 결과:" + ((double)this.number1 / this.number2));
	}
	public void newMethod() {
		
	}
}
