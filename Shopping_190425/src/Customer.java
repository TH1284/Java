import java.util.Random;

public class Customer {
	public String name = "";
	public char size = ' ';
	public Clothing[] clothes = new Clothing[4];
	public int totalPrice = 0;
	public String topPrice = "";
	
	Customer(String name){
		this.name = name;
		
		
		//사이즈 랜덤 정의
		Random rand = new Random();
		char[] sizeArr = {'S', 'M', 'L'};
		this.size = sizeArr[rand.nextInt(3)];
	}
	
	//가지고 있는 옷중 최고가의 옷을 구하는 메소드
	private void setTopPrice() {
		int topIndex = 0;
		for(int i = 0; i < clothes.length ; i++) {
			if(clothes[topIndex].getPrice() < clothes[i].getPrice()) {
				topIndex = i;
			}
		}
		
		this.topPrice = clothes[topIndex].getKinds();
	}
	
	//값을 가져오는 메소드들
	public String getClothes() {
		return this.topPrice;
	}
	
	public char getSize() {
		return this.size;
	}
	
	public int getPrice() {
		return this.totalPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	//쇼핑해온 옷을 착장하는 메소드
	public void setClothing(Clothing[] shoppingSet) {
		
		this.clothes[0] = shoppingSet[0];
		this.clothes[1] = shoppingSet[1];
		this.clothes[2] = shoppingSet[2];
		this.clothes[3] = shoppingSet[3];
		
		//totalPrice를 구해준다
		for(int i = 0; i < clothes.length ; i++) {
			this.totalPrice = this.totalPrice + clothes[i].getPrice();
		}
		
		//최고가의 옷을 찾는 메소드를 실행
		this.setTopPrice();
	}
	
	public void print() {
		System.out.printf("이름 : %s, 사이즈 : %c, 총 지불금액 : %d\n", this.name, this.size, this.totalPrice);
	}
}
