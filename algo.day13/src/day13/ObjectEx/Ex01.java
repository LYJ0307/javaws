package day13.ObjectEx;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		System.out.println(a.toString() );
		
		
		Object o = a;  // 상속 관계에서 업캐스팅
		//부모형으로 축소됩니다.
		//오버라이드 된 매서드가 우선권을 가짐 (오버라이드된 객체의 매서드가 호출된다)
		// a 객체의 toString 매서드가 호출된다
		
		System.out.println(o.toString());
		
	}

}
