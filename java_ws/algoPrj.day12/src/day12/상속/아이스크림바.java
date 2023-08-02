package day12.상속;

public class 아이스크림바 extends 아이스크림 {
	
	
	String bar;
	
	
	
	public 아이스크림바(String name, int price, String bar) {
		
		super(name, price);
		this.bar = bar;
		
	} 
	
	
	public String toString() {
		return "아이스크림 이름 : " + name + " 가격: " + price + " 이 아이스크림은 " + bar;
	}

}
