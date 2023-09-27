package java2prj1.generic.FoodBox;

public class Food {
	

	String name;
	
	

	public Food(String name) {
		super();
		this.name = name;
	}

	
	public Food() {}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Food [name=" + name + "]";
	}

}
