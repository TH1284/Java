//동점인 경우 만들기
import java.util.Random;

public class Test_score {
	public static void main(String[] args) {
		int yoorim;
		int nahyun;
		int hanbin;

		Random scoreYoorim = new Random();
		yoorim = scoreYoorim.nextInt(101);

		Random scoreNahyun = new Random();
		nahyun = scoreNahyun.nextInt(101);

		Random scoreHanbin = new Random();
		hanbin = scoreHanbin.nextInt(101);

		if (((hanbin > nahyun) && (hanbin > yoorim)) && ((nahyun > yoorim))) {
			System.out.println("일등 : hanbin. 점수는 : " + hanbin);
			System.out.println("이등 : nahyun. 점수는 : " + nahyun);
			System.out.println("삼등 : yoorim. 점수는 : " + yoorim);

		} else if (((hanbin > nahyun) && (hanbin > yoorim)) && ((yoorim > nahyun))) {
			System.out.println("일등 : hanbin. 점수는 : " + hanbin);
			System.out.println("이등 : yoorim. 점수는 : " + yoorim);
			System.out.println("삼등 : nahyun. 점수는 : " + nahyun);
			
		} else if (((nahyun > hanbin) && (nahyun > yoorim)) && ((hanbin > yoorim))) {
			System.out.println("일등 : nahyun. 점수는 : " + nahyun);
			System.out.println("이등 : hanbin. 점수는 : " + hanbin);
			System.out.println("삼등 : yoorim. 점수는 : " + yoorim);
		
		} else if (((nahyun > hanbin) && (nahyun > yoorim)) && ((yoorim > hanbin))) {
			System.out.println("일등 : nahyun. 점수는 : " + nahyun);
			System.out.println("이등 : yoorim. 점수는 : " + yoorim);
			System.out.println("삼등 : hanbin. 점수는 : " + hanbin);
			
		} else if (((yoorim > hanbin) && (yoorim > nahyun)) && ((nahyun > hanbin))) {
			System.out.println("일등 : yoorim. 점수는 : " + yoorim);
			System.out.println("이등 : nahyun. 점수는 : " + nahyun);
			System.out.println("삼등 : hanbin. 점수는 : " + hanbin);
			} else if (((yoorim > hanbin) && (yoorim > nahyun)) && ((hanbin > nahyun))) {
				System.out.println("일등 : yoorim. 점수는 : " + yoorim);
				System.out.println("이등 : hanbin. 점수는 : " + hanbin);
				System.out.println("삼등 : nahyun. 점수는 : " + nahyun);
		}
/*if ((yoorim == hanbin){
System.out.println("hanbin과 yoorim이 공동 이등입니다.");
}
		|| (yoorim == nahyun) || (hanbin == nahyun)){
	System.out.println("동점입니다.");*/
	
}
		
		
	}

