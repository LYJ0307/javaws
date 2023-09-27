package day12.상속;

public class Person {

	// 멤버 변수, 인스턴스 변수, new를 통해서 변수가 만들어짐 ( 객체라고 부른다 )
	String name;
	String id;

	// 생성자, 객체의 초기화 담당, 기본 생성자를 기본으로 제공
	// 하나라도 만들면 기본생성자 만들어지지 않는다... 주의!!
	// new 할 때 단 한번 호출된다. 생성자끼리는 호출 가능 (단 첫줄에 와야함)

	public Person() {
		this("아무개", "test01"); // 매개변수가 있는 생성자 호출한 것임
								// 생성자 -> 생성자 호출 가능

		// name="아무개";
		// id="test01";

	}

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

}
