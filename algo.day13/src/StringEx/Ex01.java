package StringEx;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//문자열을 생성하는 방법 2가지
		
		
		// 한 번 생성됩니다.
		// 정적영역(상수영역에 생성됩니다)
		// 같은 문자열을 사용할 때는 별도의 공간을 확보하는 것이 아니라
		// 래퍼런스(주소)만 제공받습니다
		
		String str0 = "hello";			// "hello"  한 개만
		String str1 = "hello";
		//문자열 수정 불가
		
		
		
		
		// 2개가 각각 생성됩니다
		
		//heap 메모리에 각각 생성됩니다.
		String str2 = new String("hello");
		String str3 = new String("hello");
		// 문자열 수정 불가		(final char[] value)

	}

}
