package java2Ppj1.실습2일차;

import java.util.function.Consumer;

public class ConsumerShop {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("===== 3만원 장보기 =====");
		
		
		Consumer<Integer> c = su -> {
			
			
			int amount = 30000;
			
			
			
			for(int i=1; i<=3; i++) {
				if (i == 1) {
					amount -= su;
					System.out.println("돼지고기 구입 후 남은 가격 = " + amount);
				} if (i == 2) {
					amount -= su;
					System.out.println("라면 구입 후 남은 가격 = " + amount);
				} if (i == 3) {
					amount -= su;
					System.out.println("해물찜 구입 후 남은 가격 = " + amount);
				}
			}
			
			
		};
		
		
		c.accept(10000);
		c.accept(5000);
		c.accept(15000);
		
	}
	

}
