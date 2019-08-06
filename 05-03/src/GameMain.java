import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
//	    // 3, 6, 9가 포함된 숫자는 다 '짝'으로 표시
//	    // 33: 짝짝
//	    try(Scanner s = new Scanner(System.in);){
//
//	      String[] players = {"철수", "영희", "길동", "한무"};
//
//	      System.out.print("☞ 3 6 9 시뮬레이션, 총 몇 번까지? >> ");
//	      int totalNum = Integer.parseInt(s.nextLine());
//	      System.out.print("☞ 게임에 참여하는 인원수? (4명까지 가능) >> ");
//	      int totalPlayerNum = Integer.parseInt(s.nextLine());
//
//	      if(totalPlayerNum <= 0 || totalPlayerNum >= 11) {
//	        System.err.println("인원수는 1 ~ 4 사이에서 입력해주세요.");
//	        System.exit(1);
//	      }
//
//
//	      int playerCount = 0;
//	      for(int i=1; i <= totalNum; i++ ) {
//	        char[] tempArray = String.valueOf(i).toCharArray();    
//	        // 숫자를 쪼개 char 배열에 저장
//	        int sygCount = 0;
//
//	        for(int j=0; j < tempArray.length; j++) {
//	          if(tempArray[j] == '3' || tempArray[j] == '6'
//	              || tempArray[j] == '9') {
//	            sygCount++;    // 쪼갠 숫자 각각에 3, 6, 9가 있는 경우 그 개수를 카운트
//	          }                
//	        }
//
//	        if(playerCount == totalPlayerNum) {
//	          playerCount = 0;					
//	        }
//	        System.out.print(players[playerCount++] + ": ");
//
//
//	        if (sygCount == 0) {
//
//	          System.out.println(i);
//	        } else {
//	          for(int k=1; k <= sygCount; k++)    
//	            // i에 3, 6, 9가 있는 경우 그 개수만큼 '짝'을 표시함
//	            System.out.print("짝");
//	          System.out.println();
//	        }
//
//	      }
//	    }catch(Exception e) {
//	      e.printStackTrace();
//	    }
		Game g = new Game();
		g.ss();


	  }
	}