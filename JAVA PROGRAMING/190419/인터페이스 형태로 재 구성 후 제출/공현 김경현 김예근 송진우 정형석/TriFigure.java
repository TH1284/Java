import java.util.Scanner;
public class TriFigure implements Figure {
	public String tmp;
	public double triHight;
	public double triBaseside;
	public double triAreaValue;
	Scanner scan = new Scanner(System.in);
 public void inputValue() {
	 System.out.println("삼각형의 높이를 입력해주세요.");
	 tmp = scan.nextLine();
	 try {
		 this.triHight =Double.parseDouble(tmp);
	 } catch (Exception e) {
		 this.triHight = 0;
	 }
	 System.out.println("삼각형의 밑변을 입력해주세요.");
	 tmp= scan.nextLine();
	 try {
		 this.triBaseside =Double.parseDouble(tmp);
	 } catch (Exception e) {
		 this.triBaseside = 0;
	 }
	 this.triAreaValue = (this.triBaseside * this.triHight)/2;
 }
 
 public void printResult() {
	 System.out.println("삼각형의 넓이는 "+this.triAreaValue+" 입니다.");
 }
}
