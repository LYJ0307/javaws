package algo.day11;

public class 쇼핑몰정보 {
	
	private String name;
	private int order;
	private String id;
	private String date;
	private String address;
	
	
	public void 생성자(String name, int order, String id, String date, String address) {
		this.name=name;
		this.order=order;
		this.id = id;
		this.date = date;
		this.address = address;
	}
	
	
	public String toString() {
		
		return "이름: " + name + "주문번호: " + order + "아이디: " + id + "주문일자: " + date + "주소: " + address ;
	}
	
	
}
