package java2prj1.interFace.arrayList;

public class MyArrayList {
	
	private Object[] nums ; 
	private int current;
	
	
	public MyArrayList() {
		nums  = new Object[5];;
		current=0;
	}
	
	
	public void add(Object obj) {
		nums[current] = obj;
		current++;
	}
	
	
	public Object get(int index) {
		return nums[index];
	}
	
	public int size() {
		return current;
	}
	
	public void claer() {
		current=0;
	}
	
	
	public void forEach(MyConsumer c) {
		for (int i=0; i<current; i++) {
			c.accpet(get (i));
		}
	}

	

}
