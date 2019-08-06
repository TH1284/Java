import java.util.Random;

public class Test1 {
	String name;
	int middleScore;
	int finalScore;
	
	
	Test1(String name) {
		this.name = name;
		Random r = new Random();
		this.middleScore = r.nextInt(1001);
		this.finalScore = r.nextInt(1001);
	}
	@Override
	public String toString() {
		return this.name + "(중간:" + this.middleScore+",기말:" + this.finalScore+")";
	}
}
