package t1;




public class 올리브영정보 {
	

	public String name;
	public String Manufacturer;
	public int price;
	public int pop;
	public int sum;
	public int Tsum;
	
	
	
	
	public 올리브영정보() {};
	
	
	
	public 올리브영정보(String name, String Manafacturer, int price) {
		
		super();
		this.name=name;
		this.Manufacturer = Manafacturer;
		this.price = price;
		
	}
	
	
	
	void popular() {
		pop++;
	}
	
	

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	@Override
	public String toString() {
		return "올리브영정보 [이름=" + name + ", 제조사=" + Manufacturer + ", 가격=" + price + "]";
	}
	
	

}
