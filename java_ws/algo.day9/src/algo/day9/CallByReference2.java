package algo.day9;

public class CallByReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] kors = new int[3];	// new 연산자를 이용해서 주소값을 넣고 kors에 넣는다

		
		//참조형 변수의 기본값 : null

		// 등록
		
		insert(kors);
		
		// 조회
		select(kors);
		
		
		int a;	// 기본형 변수
		int b;	// 기본형 변수 , 정수형의 데이터
		int[] c = new int[3];	// c 참조변수
		int[][] d = new int[3][2];	// d 참조형 변수
		String s; 	// s는 참조형 변수 : null (아무것도 참조하고 있지 않다는 의미)
		

	}

	// main에서 호출할 때 주소값을 받아서 주소값을 줌
	public static void select(int[] a ) {
		System.out.println(a[0]);	//배열의 주소값이 들어간다
		System.out.println(a[1]);
		System.out.println(a[2]);
	}

	public static void insert(int[] b) {
		b[0] = 5;
		b[1] = 8;
		b[2] = 9;
	}

}
