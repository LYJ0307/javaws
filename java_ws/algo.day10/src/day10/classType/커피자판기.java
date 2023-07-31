package day10.classType;

public class 커피자판기 {
	
	
	int 설탕 = 15000;
	int 우유 = 10000;
	int 프리마 = 10000;
	int 원두 = 5000;;
	int 물 = 20000;
	int 매출금액 = 0;
	
	
	public void blackcoffee() {
		this.물 += 10000;
		this.원두 += 5000;
		this.프리마 -= 3000;
		this.매출금액 += 5000;
		printblackcoffe();
		
		
	}
	
	
	public void printblackcoffe() {
		System.out.println("------- 블랙커피 --------");
		System.out.println("물: "+this.물);
		System.out.println("원두: "+this.원두);
		System.out.println("프리마: "+this.프리마);
		System.out.println("매출금액: "+this.매출금액);
	}
	
	
	
	public void cappuccino() {
		this.물 -= 10000;
		this.원두 += 6000;
		this.우유 += 10000;
		this.프리마 += 5000;
		this.매출금액 += 8000; 
	}
	
	
	
	public void printInfo() {
		System.out.println("커피 정보 출력");
		System.out.println(물);
		System.out.println(원두);
		System.out.println(우유);
		System.out.println(프리마);
		System.out.println(매출금액);
	}
	

}
