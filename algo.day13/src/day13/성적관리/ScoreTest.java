package day13.성적관리;

public class ScoreTest {

	public static void main(String[] args) {
		
		
		Score s = new Score("홍길동", 90, 90);
		
		//s.CalResult();   	// 3객체의 레퍼런스가 인자 정보로 제공됨
		s.CalResult();		// CalResult() 매서드는 객체가 생성된 이후부터 사용 가능
		
		
		String result = s.toString();
		System.out.println( s);
		System.out.println(result);
		
		
		

	}

}
