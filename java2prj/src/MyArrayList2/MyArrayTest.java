package MyArrayList2;

public class MyArrayTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayList list = new MyArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.forEach(new MyConsumer() {

			@Override
			public void accept(Object o) {
			  System.out.println(o);
				
			}});
			 
	}
}