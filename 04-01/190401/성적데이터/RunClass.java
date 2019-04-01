
public class RunClass {
	public static void main(String[] args) {
		Strudent[] sArr = new Strudent[5];
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new Strudent();
			sArr[i].inputScore();
		}
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		for (int i = 0; i < sArr.length; i++) {
			korTotal = korTotal + sArr[i].korScore;
			engTotal = engTotal + sArr[i].engScore;
			mathTotal = mathTotal + sArr[i].mathScore;
		}
		
		System.out.println("국어 총점은 : " + korTotal);
		System.out.println("영어 총점은 : " + engTotal);
		System.out.println("수학 총점은 : " + mathTotal);

		System.out.println("국어 평균은 : " + ((double)korTotal / sArr.length));
		System.out.println("영어 평균은 : " + ((double)engTotal / sArr.length));
		System.out.println("수학 평균은 : " + ((double)mathTotal / sArr.length));
	}
}
