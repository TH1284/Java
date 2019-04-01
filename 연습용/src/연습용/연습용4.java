package 연습용;

public class 연습용4 {
	public static void main(String[] args) {
		연습용3[] sArray = new 연습용3[5];
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new 연습용3();
			sArray[i].inputScore();
		}
		
		int kortotal = 0;
		int engtotal = 0;
		int mathtotal = 0;
		
		for(int i = 0; i < sArray.length; i++) {
			kortotal = kortotal + sArray[i].korScore;
			engtotal = engtotal + sArray[i].engScore;
			mathtotal = mathtotal + sArray[i].mathScore;
						
		}
		
		System.out.println("국어 총점은 : " + kortotal);
		System.out.println("영어 총점은 : " + engtotal);
		System.out.println("수학 총점은 : " + mathtotal);
		
		System.out.println("국어평균은 : " + ((double)kortotal / sArray.length));
		System.out.println("영어평균은 : " + ((double)engtotal / sArray.length));
		System.out.println("수학평균은 : " + ((double)mathtotal / sArray.length ));
		
	}
}
