import java.util.Random;

public class Shop {
	private int length = 10;
	private Clothing[] top = new Clothing[length];
	private Clothing[] bottom = new Clothing[length];
	private Clothing[] outer = new Clothing[length];
	private Clothing[] underwear = new Clothing[length];

	// constructor
	Shop() {
		//각각 top, bottom, outer, underwear의 이름으로 10개씩을 만들어준다
		for (int i = 0; i < length; i++) {
			top[i] = new Clothing("top");
			bottom[i] = new Clothing("bottom");
			outer[i] = new Clothing("outer");
			underwear[i] = new Clothing("underwear");
		}
	}

	public void printShop() {
		for (int i = 0; i < length; i++) {
			System.out.printf("%d번째 : ", i + 1);
			System.out.print(top[i].toString());
		}
		for (int i = 0; i < length; i++) {
			System.out.printf("%d번째 : ", i + 1);
			System.out.print(bottom[i].toString());
		}
		for (int i = 0; i < length; i++) {
			System.out.printf("%d번째 : ", i + 1);
			System.out.print(outer[i].toString());
		}
		for (int i = 0; i < length; i++) {
			System.out.printf("%d번째 : ", i + 1);
			System.out.print(underwear[i].toString());
		}
	}
	
	//손님을 불러와 옷을 판다 => Customer c의 객체데이터를 인자로 받아 c의 setClothing에 각각의 배열에 있는 옷을 세팅해준다.
	public void sell(Customer c) {
		Random rand = new Random();
		//장바구니의 개념의 배열
		Clothing[] shoppingSet = new Clothing[4];

		//top 쇼핑
		for (int i = 0; i < this.length; i++) {
			// size 체크. 옷의 사이즈가 손님의 사이즈가 같은 경우
			if (c.getSize() == top[i].getSize()) {
				// check sold. 판매되있는 것이 아니라면
				if (!top[i].getSold()) {
					//장바구니에 담는다
					shoppingSet[0] = top[i];
					//옷을 soldout으로 체크한다
					top[i].setSold();
					break;
				}
			}
			//맞는사이즈에 남은 옷이 없으면 구매x
			Clothing temp = new Clothing("top");
			temp.setZero();
			shoppingSet[0] = temp;
		}
		
		//bottom
		for (int i = 0; i < this.length; i++) {
			// size 체크. 옷의 사이즈가 손님의 사이즈가 같은 경우
			if (c.getSize() == bottom[i].getSize()) {
				// check sold. 판매되있는 것이 아니라면
				if (!bottom[i].getSold()) {
					shoppingSet[1] = bottom[i];
					bottom[i].setSold();
					break;
				}
			}
			Clothing temp = new Clothing("bottom");
			temp.setZero();
			shoppingSet[1] = temp;
		}
		
		//outer
		for (int i = 0; i < this.length; i++) {
			// size
			if (c.getSize() == outer[i].getSize()) {
				// check sold
				if (!outer[i].getSold()) {
					shoppingSet[2] = outer[i];
					outer[i].setSold();
					break;
				}
			}
			Clothing temp = new Clothing("outer");
			temp.setZero();
			shoppingSet[2] = temp;
		}
		
		//under
		for (int i = 0; i < this.length; i++) {
			// size
			if (c.getSize() == underwear[i].getSize()) {
				// check sold
				if (!underwear[i].getSold()) {
					shoppingSet[3] = underwear[i];
					underwear[i].setSold();
					break;
				}
			}
			Clothing temp = new Clothing("underwear");
			temp.setZero();
			shoppingSet[3] = temp;
		}

		//마지막으로 장바구니배열에 받은 옷들을 입는다.
		c.setClothing(shoppingSet);
	}
}
