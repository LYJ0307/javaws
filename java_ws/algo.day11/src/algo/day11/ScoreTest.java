package algo.day11;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체는 new (동적 메모리) 방식으로 공간을 확보합니다. !
		// 확보된 공간의 주소(래퍼런스)를 저장한 뒤 사용합니다
		// 반드시 참조형 변수가 필요하다!!!!
		// 참조형 변수: 주소(래퍼런스)를 저장하는 변수입니다.
		// 참조형 변수의 기본값: null
		// null : 참조하지 않는 상태를 의미하는 값
		
		
		Score s = null; // s 참조형 변수
		s = new Score();
		
		
		Score s1 = new Score("허재혁", 100, 100, 100);// 매개변수가 있는 것, 생성자
		s1.calResult();
		Score s2 = new Score("홍길동");
		s2.calResult();
		Score s3 = new Score("김민규", 100, 100, 100);
		s3.calResult();
		
		
		s.printInfo();
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		
		//매서드 오버로딩
		//매서드 이름이 동일하고 매개 변수의 정보가 다른 것을 말한다.
		//매서드의 이름이 무겁다는 의미는 이 이름으로 만들어진 매서드가 많다라는 의미
		
		System.out.println("i like java");
		System.out.println(30);
		System.out.println(25.3);
		System.out.println(new char[] {'a', 'b', 'c'});
		
		
		char[] chs = new char[] {'a', 'b', 'c'};
		System.out.println(chs);

	}

}
