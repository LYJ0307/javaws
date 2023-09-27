package java2prj1.generic.Toy;

public class Toy {
	
	
	String name;
	
	public Toy( ) {
	}

	public Toy(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + "]";
	}
	

}
