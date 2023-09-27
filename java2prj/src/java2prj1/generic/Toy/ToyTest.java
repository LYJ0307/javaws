package java2prj1.generic.Toy;

public class ToyTest {

	public static void main(String[] args) {		
		
		ToyBox<Toy> t = new ToyBox<>();
		t.add(new Toy("시크릿쥬쥬"));
		t.add( new Car("아반떼") );
		t.add(new Toy("쇼핑카트"));
		t.add(new Toy("캐치티니핑"));
		
		
		for(int i=0; i<t.size(); i++) {
			System.out.println(t.get(i));
		}
		

	}

}
