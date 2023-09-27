package t1;

public class 맛집정보 {
	

	String name;
	String address;
	String number;
	int cnt;
	
	
	public 맛집정보() {};
	
	
	public 맛집정보(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	};
	
	
	public void updatecnt() {
		cnt++;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	@Override
	public String toString() {
		return "맛집정보 [이름=" + name + ", 주소=" + address + ", 핸드폰 번호=" + number + "]";
	}
	

}
