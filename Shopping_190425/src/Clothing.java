import java.util.Random;

public class Clothing {

	private String kinds = "";
	private char size = ' ';
	private int price = 0;
	private boolean sold = false;
	
	//Constructor
	Clothing(String kinds){
		Random rand = new Random();
		this.kinds = kinds;
		
		
		//사이즈 랜덤정의
		char[] sizeArr = {'S', 'M', 'L'};
		this.size = sizeArr[rand.nextInt(3)];
		
		//가격의 범위 : 1000~50000 => ((0~49) + 1) * 1000, 최소금액단위 : 100 = > (0~9) * 100
		this.price = (rand.nextInt(50) + 1) * 1000  + rand.nextInt(10)*100;
	}
	
	
	@Override
	public String toString() {
		String cFormat = String.format("종류 : %s, 사이즈 : %c, 가격 : %d, SOLDOUT : %b\n", this.kinds, this.size, this.price, this.sold);
		return cFormat;
	}
	//프로퍼티 값을 가져오는 메소드들
	public String getKinds() {
		return this.kinds;
	}
	public char getSize() {
		return this.size;
	}
	public int getPrice() {
		return this.price;
	}
	public boolean getSold() {
		return this.sold;
	}
	public void setSold() {
		this.sold = true;
	}
	
	//모든값을 0으로 초기화하는 메소드, customer가 가져갈 옷이 없는 경우를 위해 만들었음.
	public void setZero() {
		this.kinds = "NULL";
		this.sold = true;
		this.size = ' ';
		this.price = 0;
	}
}

