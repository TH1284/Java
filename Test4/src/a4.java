import java.util.Random;
import java.util.Scanner;

public class a4 {
public static void main(String[] args) {
	
	int gawiBawBoCumputer;
	int gawBawBoUser;
	
	Random rand = new Random();
	gawiBawBoCumputer =  rand.nextInt(3);
	
	Scanner scan = new Scanner(System.in);
	System.out.print("가위바위보를 입력해주세요./n 가위는 0,바위는 1,보는 2 입니다");
	gawBawBoUser = scan.nextInt();
	
	if (gawiBawBoCumputer == gawBawBoUser) {
		System.out.print("비겼습니다");
	}else if (gawiBawBoCumputer == 0 && gawBawBoUser == 1) {
		System.out.println("사용자가 이겼습니다");
	}else if (gawiBawBoCumputer == 0 && gawBawBoUser == 2) {
		System.out.println("컴퓨터가 이겼습니다");
	}else if (gawiBawBoCumputer == 1 && gawBawBoUser == 0) {
		System.out.println("컴퓨터가 이겼습니다");
	}else if (gawiBawBoCumputer == 1 && gawBawBoUser == 2) {
		System.out.println("사용자가 이겼습니다");
	}else if (gawiBawBoCumputer == 2 && gawBawBoUser == 0) {
		System.out.println("사용자가 이겼습니다");
	}else if (gawiBawBoCumputer == 2 && gawBawBoUser == 1) {
		System.out.println("컴퓨터가 이겼습니다");
	}
}
}