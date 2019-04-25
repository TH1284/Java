import java.util.Locale;

	public class SixSquare extends Figure {
		
		double 한변의길이 = 0;

		SixSquare(){
			this.name = "*정육각형 넓이 구하기*";
		}
		@Override
		public void inputValue() {
			// TODO Auto-generated method stub
			
			super.printResult();
			
			java.util.Scanner sc = new java.util.Scanner(System.in);
			String tmp;
			System.out.println("한번의 길이를 이용해 정육각형의 넓이를 구해보자");
			System.out.println("한번의 길이를 입력해주세요.");
			tmp = sc.nextLine();
			try {
				this.한변의길이 = Integer.parseInt(tmp);
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요 ㅠㅠㅠㅠㅠㅠ");
			}
			System.out.println("한변의 길이는 " + 한변의길이 + " 입니다.");	
		}
		
		public void 계산하자(){
	
			double 한변의길이제곱값 = 한변의길이*한변의길이;
			double 결과 = 0;
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("소수몇번째 자리 까지 출력할까요?? 입력해주세요...");
			int 소수자리 = sc.nextInt();
		
			결과 = (double)((3*(Math.sqrt(3))/2)*한변의길이제곱값);
			결과 = Double.parseDouble(String.format(Locale.KOREAN, "%."+소수자리+"f", 결과));   // N 대신 2 넣으면 소수점 2번째 자리까지 실행

			System.out.println("한변의 길이가 "+ 한변의길이 + " 인 정육각형의 넓이는? "+ 결과 + "(소수점"+소수자리+"번째 자리까지 표현)");	
		}	
	}


