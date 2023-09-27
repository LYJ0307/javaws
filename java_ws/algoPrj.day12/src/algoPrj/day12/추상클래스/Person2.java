package algoPrj.day12.추상클래스;

// 추상매서드를 하나라도 가지면 추상클래스가 됩니다.
// 일반매서드도 가질 수 있다.


abstract class Person2 {

	public void 걷는다() {
		System.out.println("걷는다.");
	}
	
	// 매서드
	// 매서드 선언부
	// 매서드 정의부 (구현부)
	public abstract void dance() ;   
	// 매서드 선언부만 가지고 있는것 , 미완성 매서드   
	
	/*
	 * dance매서드는 구현이 정상적으로 된 코드이다.
	 * public void dance() {
	 * 
	 * }
	 * 
	 * public void dance(); 
	 * => 매서드 선언부만 가지고 있는 것 : 미완성 매서드
	 * public static void main(String[] args) {
	 *		Person2 p = new Person2();
	 *		p.dance(); // 동작한다.
	 * }
	 */
	
	// 
	
	
}
