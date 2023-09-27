package algoPrj.day12.다형성예제;




// 추상 매서드(매서드의 선언부만 가지는 매서드)를 하나라도 가지면 추상 클래스가 됩니다.
// 일반 매서드와 가질 수 있다.


// 매서드
// 매서드 선언부
// 매서드 정의부  (구현부) {  }
abstract class  Person2 {
	
	//추상 매서드를 하나라도 가지면 추상 클래스가 됩니다.
	//일반 매서드도 가질 수 있습니다.
	
	public void 걷는다() {
		System.out.println("걷는다.");
	}
	
	
	
	public abstract void dance();
	//매서드 선언부만 가지고 있는 것, 미완성 매서드 
	
	
	
	// dance
    /*public void dance(){
             System.out.println("사람이  춤을 춘다"); 
    }*/
    
}


// 반환 타입이 있으면 함수
// 클래스랑 이름이 같고, this.로 값을 초기화하면 그건 생성자
