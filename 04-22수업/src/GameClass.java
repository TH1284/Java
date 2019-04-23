
public class GameClass {
	public static void main(String[] args) {
		A_groupOfGames a = new A_groupOfGames();
//		a.inputDan();
		
		try {
			a.inputDan();
		} catch (Exception e) {
			System.out.println("inputDan에서 오류발생");
		}
		
		java.io.File file = new java.io.File("c:\\file.text");
		try {
			file.getCanonicalFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
