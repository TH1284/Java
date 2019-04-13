import java.util.Scanner;

public class quesExtend2 extends Figure { //�ڽ�Ŭ����
	//������ ���� ���ϱ�
	double downCase=0;//�غ� ��������
	double upCase=0;//���� ��������
	double outResult=0;//����� ��������
	quesExtend2() {
		this.name="오각형 구하기";
	}
	
	@Override //���� inputValue�� ������ �����Ǹ� ���ִ� ����������.
	public void inputValue() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("밑변 값은");
		this.downCase=s.nextDouble();
		
		System.out.println("높이 값은)");
		this.upCase=s.nextDouble();				
	}
	
		public void printResult() {
			
			outResult=(((double)((this.downCase * this.upCase)) / 2) * 5);
			System.out.println("넓이는"+this.downCase + "*" + this.upCase
					+ "*" + "5" + "=" + outResult + "(cm**2)"+"입니다");
	}
}
