
public class Game {
	                                          
	public void ss() {
		
		for(int i=0; i<10; i++) {
			for(int j=1; j<10; j++) {
				
				try {
					
					if(i>0 && i%3==0 && j%3 ==0) {
						System.out.println("짝짝"+j+i);
					}
					else if(i>0 && (i%3==0 || j%3 == 0)) {
						System.out.println("짝"+j+i);
					}
					else {
						System.out.println(j+i);
					}
				}
				catch(Exception e) {
					System.out.println("짝"+j+i);
				}
			}
		}
	}
	
	
	
	
}
