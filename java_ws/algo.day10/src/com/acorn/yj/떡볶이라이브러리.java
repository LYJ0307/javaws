package com.acorn.yj;

public class 떡볶이라이브러리 {
	
	private String 맵기;
	private int 고추가루;
	private int 계란;
	private int 사리;
	private int 떡;
	
	
	
	
	public void input(String 맵기, int 고추가루, int 계란, int 사리, int 떡) {
		this.맵기 = "많이 맵게";
		this.고추가루 = 50;
		this.계란 = 2;
		this.사리 = 2;
		this.떡 = 20;
		
	}
	
	
	
	public void showInfo() {
		System.out.println("떡볶이 제조 과정");
		System.out.println("계란: "+this.계란);
		System.out.println("사리: "+this.사리);
		System.out.println("고추가루: "+this.고추가루);
		System.out.println("떡: "+this.떡);
		System.out.println("맵기: "+this.맵기);
	}

	
	

}