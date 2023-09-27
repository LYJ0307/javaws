package day11.inheritance.상속;


// 상속받을 때 사용하는 키워드  extends
// 확장하다

public class Cat extends Animal {
	
	
	public void 쥐를잡는다() {
		System.out.println(" 쥐를 잡는다");
	}
	
	
	//부모의 매서드를 재정의하는 것
	//오버라이딩
	
	/* 부모의 매서드 재정의할 수 있다. => 오버라이딩
	 * 부모의 매서드를 재정의할 때는 반드시 입력, 반환 정보 모두 같아야 한다. */
	@Override
	public void 짖는다() {
		System.out.println("멍멍");
	}
	
	
}




