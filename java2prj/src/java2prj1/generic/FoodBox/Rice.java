package java2prj1.generic.FoodBox;

public class Rice extends Food {
	
	
	String name;
	
	
	public Rice(String name) {
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
		return "Rice [name=" + name + "]";
	}

}
