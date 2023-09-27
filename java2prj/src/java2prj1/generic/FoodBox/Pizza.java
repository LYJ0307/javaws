package java2prj1.generic.FoodBox;

public class Pizza extends Food {
	
	
	String name;
	
	
	public Pizza() {}
	
	
	public Pizza(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + "]";
	}

}
