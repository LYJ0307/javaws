package day16.프로젝트;

public class Customer연습 {
	
	String name;
	String phone;
	String address;
	int order;		// 멤버 변수
	
	
	public Customer연습() {};		// 기본 생성자
	
	
	public Customer연습(String name, String phone, String address, int order) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.order = order;
	}
	
	
	@Override
	public String toString() {
		return "Cutomer [name = " + name + ", phone = " + phone + ", address = " + address + ", order = " + order + "]";
	}
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}

	
	

}
