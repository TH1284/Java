
public class Number2 {
	String number = "5";
	int sum = 0;
	int multiply= 1;
	public void inputNum(int sum, int multiply) {
		int intNum = Integer.parseInt(number);
		for(int i=1; i<=intNum; i++) {
			this.sum += i;
			this.multiply = this.multiply * i;
		}
		
	}
	
	public void resultPrint() {
		inputNum(sum,multiply);
		System.out.println("선택한 숫자는 : 5");
		System.out.println("결과값 합은 : " + sum);
		System.out.println("결과값 곱은 : " + multiply);
}
}
