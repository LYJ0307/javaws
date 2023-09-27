package algo.day11;


//학생 성적 정보를 담을 수 있는 자료형
//멤버 변수 + 멤버 메서드 (멤버 변수를 사용하는 매서드)
// 멤버매서드는 객체가 생성된 이후부터 사용 가능함


// type 정의함 주의사항 : 변수가 만들어진 것이 아니다
public class Score {
	
	// 멤버 변수(인스턴스 변수)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private boolean result;		// 
	
	
	//  값의 초기화 담당  => 특별한 매서드  생성자
	// 반환타입 명시하면 안 됨 주의사항!! (반환 타입이 있으면 매서드로 인식)
	// 이름이 반드시 클래스명과 동일해야 합니다.
	// 객체가 생성될 때 (new를 통한 생성) 값의 초기화를 담당하는 특별한 매서드
	// 생성자를 하나도 만들지 않으면 기본 생성자를 제공합니다.
	// 생성자를 하나라도 만들면 기본 생성자는 제공되지 않는다.
	// Score Type이 메모리에 태어났다. 생성되었다.
	
	
	//생성자 오버로딩합니다.		매개변수가 반드시 달라야 한다.
	// 오버로딩이란 매서드의 이름은 동일하고 매개 변수가 다른 경우를 말한다. (개수, type이 다른 것을 말함)
	// 오버로딩시 반환 타입이 다른 것은 오버로딩이 되지 않는다.
	
	public Score() {
		
	}
	
	
	//생성자에게 객체 변수 값의 초기화 담당
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public Score(String name) {
		
		this(name, 60, 60, 60);
		
		/*
		 * 생성자끼리는 서로 호출할 수 있다. 단 반드시 첫줄에 와야 한다.
		 * 생성자 호출시 this() 표현으로 호출함
		this.name = name;
		this.kor = 60;
		this.eng = 60;
		this.math = 60;
		 */
	}
	
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.math);
		System.out.println(this.result);
	}
	
	
	public void calResult() {
		// 80점 이상이면 합격
		
		int sum = kor+eng+math;
		double avg = sum / 3.0;
		
		if( avg >= 80) {
			result = true;
		} else {
			result = false;
		}
		
	}
	
	
	
	// 현재 객체 정보를 문자열로 반환하는 기능
	public String toString() {
		
		return name + " " + kor + " " + eng + " " + math + " " + "결과: " + result;
		
	}

}
