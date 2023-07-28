package day9.class자료형;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		// 
		
		int a;
		// 자료형		변수 ;
		// 배열, 객체는 메모리에 공간을 확보하는 행위를 할 때는 new로 힙메모리 사용 강제되어 있음
		
		
		// 자바에서 class라는 아이를 들어냄
		Customer  c = new Customer();
		
		c.name = "홍길동";
		c.age = 25;
		c.id = "angel";
		
		
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.age);
		

	}

}
