package day16.프로젝트;

public class Customer1 {
	
	String name;
	String phone;
	String address;

	
	public Customer1() {};
	
	
	public Customer1(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "이름 = " + name + "  휴대폰 번호: " + phone + "  주소: " + address;
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
	
	
	
}
