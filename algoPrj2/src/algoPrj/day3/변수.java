package algoPrj.day3;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 : 메모리블럭, 기억장소 (공간), 기억장소를 식별하기 위한 이름
		
		// 변수 선언
		int a;   // 4byte 기억공간 기억장소를 확보함
		
		
		// 자료형
		// 크기 + 해석방법
	
		
		// 자료형 ( 공간의 크기와 해석을 하는 방법 제공함 )
		
		/*
		 * 		int  :  정수형,  4byte  예시) int a ;
		 * 
		 * 		byte : 1byte (8bit로 구성되어 있음, 1bit sign  -128~+127)
		 * 		short : 2byte (16bit)  -32768 ~ 32767
		 * 		int  :  4byte (32bit)		-2147483648 ~ 2147483647
		 * 		long :  8byte  (64bit)		9223372036854775807L  ;   //  922
		 * 
		 * 
		 * 
		 * 		char : 문자형  :  문자 하나를 저장할 수 있는 공간, 2byte
		 * 		예시 ) char ch = 'a';			// 한 문자  '  '  표현;
		 * 		예시 ) char ch2 = '한';
		 * 
		 * 
		 * 		double  :  실수형 데이터를 저장할 수 있는 공간  :  8Byte
		 * 					소수 이하 15자리 표현
		 * 		float  :  4byte 소수 이하 7자리 표현
		 * 
		 * 
		 * 		boolean  :  논리형  true, false의 값 출력
		 * 
		 *
		 * 
		 */
		
		// 리터럴 : 값자체  ,  10, 10.3,  'a',   "hello",  true
		// 상수 영역에 저장된다
		// 크기를 가진다.
		// 정수형값 int형 저장
		// 실수형값 double형 저장
		
		
		int iNum = 334;		//ok   334라는 값이 상수 영역에 저장되는 것   ok
							//iNum  기억장소에 저장되는 것
		
		//long iLong = 2200000000;
						//		22억 값 상수 영역에 저장하는 것에 문제 발생 X  
						//
		long iLong = 2200000000L;
					//long형 리터럴 값을 표현해야 함,  숫자 L로 long형 리터럴 표현함
		
		
		double d = 23.3;	// 23.3  실수형 리터럴이 double형으로 상수영역 저장
							// d라는 변수에 저장됨		ok
		
		//float f = 23.3;		// 23.3 상수 영역에 저장되는 것이 문제 발생 X
		// double형의 값이 float이라고 하는 변수에 저장될 때 문제 발생됨 X
		
		
		float f = 23.3f;	// 상수 영역에 float형 값으로 저장될 수 있도록 표현해야 함
							// 숫자f 표시해야 float형 상수로 저장됨
		
		
		char ch = 'a';		// 한 문자를 저장하기 위한 공간을 확보할 때 사용하는 자료형
							// ' ' 한 문자 표현한다.
							//2byte 사용함
		
		char ch2 = '한';
		
		
		System.out.println(ch);
		System.out.println(ch2);
		
		
		//"문자열 표현할까요?"
		// 문자열은 문자 여러개입니다 문자의 집합
		
		//"i like java"
		
		
		char[] str = {'I', ' ', 'L', 'I', 'K', 'E', ' ', 'J','A','V','A'};
		char[] str2 = new char[11];
		
		
		str2[0]='I';
		str2[1]=' ';
		str2[2]='L';
		str2[3]='I';
		str2[4]='K';
		str2[5]='E';
		str2[6]=' ';
		str2[7]='J';
		str2[8]='A';
		str2[9]='V';
		str2[10]='A';
		
		
		
		System.out.print(str2[0]);
		System.out.print(str2[1]);
		System.out.print(str2[2]);
		System.out.print(str2[3]);
		System.out.print(str2[4]);
		System.out.print(str2[5]);
		System.out.print(str2[6]);
		System.out.print(str2[7]);
		System.out.print(str2[8]);
		System.out.print(str2[9]);
		System.out.print(str2[10]+"\n");
		
		
		String str3 = "i like java";
		System.out.println(str3);
		
		
		char result = str3.charAt(2);		//해당 배열 꺼내기
		System.out.println(result);
		
		
		// 논리값을 저장할 수 있는 자료형 boolean  true, false
		boolean flag = true;	// 
		
		if ( flag == true) {
			System.out.println("조건이 참입니다.");
		}
		
		if ( flag ) {
			System.out.println("조건이 참입니다.");
		}else {
			System.out.println("조건이 거짓입니다.");
		}
		
		
		
		
		System.out.println(str);
		System.out.println(str2);
		
		
	}

}