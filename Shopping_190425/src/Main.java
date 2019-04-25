
public class Main {
	public static void main(String[] args) {
		//매장 인스턴스 하나를 만든다
		Shop shop = new Shop();
		//손님 5명을 만든다
		Customer[] c = new Customer[5];
		String[] names = {"박재원","녠녜미","최수찬","김해리","박종선"};
		
		//손님에게 이름을 배정하고, 매장에서 손님에게 판다
		for(int i = 0; i < c.length ; i++) {
			c[i] = new Customer(names[i]);	
			shop.sell(c[i]);
		}
		
		//가장 최고가의 옷을 산 손님을 찾는다.
		int topIndex = 0;
		for(int i = 0; i < c.length ; i++) {
			if(c[topIndex].getPrice() < c[i].getPrice()) {
			topIndex = i;
			}
			//손님프린트
			c[i].print();
		}
		
		//프린트
		System.out.println("최고의 큰손 : " + c[topIndex].getName()
							+ ", 총 지불금액 : " + c[topIndex].getPrice()
							+ ", 최고가의 상품 : " + c[topIndex].getClothes());
		//매장의 옷의 상태 프린트
		shop.printShop();
	}
}
