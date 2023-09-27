package day6;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//배열은 초기화를 해준다
		//자료형의 기본값으로 초기화해 줌
		
		
		//배열은 기억단계와 처리단계가 다를 때 반드시 필요함

		
		// 배열
		
		
		// 1. 배열 사용해 보기
		// 2. 배열 이해하기
		
		
		//자바 1차원 배열
		
		
		//변수 5개 선언 (메모리 공간을 확보하는 행위)
		//int a,  b,  c,  d,  e;
		
		
		// 배열 선언
		// 자바는 배열부터 heap메모리 사용 강제한다.
		
		
		// c에서 배열을 선언하는 코드, 자바는 사용할 수 없다.
		// c언어에서 배열을 선언하는 두 가지 방법입니다.
		
		// int arr[5];	==> c만 가능함
		// int* arr2 = (int*)malloc( sizeof(int) *5);
		
		
		// 자바에서 배열을 선언하는 방법
		int[] kors = new int[5];
		int[] kors2 = {90, 80, 99, 100, 89};	// 배열의 초기화 블럭
		
		
		int a=10, b=5, c=8, d=9, e=25;
		int sum = a+b+c+d+e;
		System.out.println( sum);
		
		
		int[] arr = new int[5];
		
		// arr[0]=10;	X, 배열명은 배열 (연속적인 기억장소의 시작점이다)
		arr[0]=10;
		arr[1]=5;
		arr[2]=8;
		arr[3]=9;
		arr[4]=25;
		
		int sum2 = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		
		
		System.out.println( a);
		System.out.println( b);
		System.out.println( c);
		System.out.println( d);
		System.out.println( e);
		
		
		//배열의 첨자는 변수를 사용할 수 있다.
		//반복문을 사용할 수 있다.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//내가 좋아하는 것 5개
		// char[] arr = new char[5];	' '
		// double[] arr2 = new double[5];
		// String[] arr3 = new String[5]; " "
		// int[] arr4 = new String[5];
		
		
		
		int []scores = new int[4];

		
		scores[0] = 5;
		scores[1] = 10;
		scores[2] = 15;
		scores[3] = 25;
		
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		
		String[] menu = new String[3];
		
		
		menu[0] = "레몬에이드";
		menu[1] = "자몽에이드";
		menu[2] = "블루에이드";
		
		
		for(int i=0; i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		
		
		//자바 문자 표현 : char, 2byte, 한글 한자 표현 가능함
		// 한 문자 표현함 "가나다라마"
		
		
		char[] arr_ch = new char[5];
		
		arr_ch[0] = '가';
		arr_ch[1] = '나';
		arr_ch[2] = '다';
		arr_ch[3] = '라';
		arr_ch[4] = '마';
		
		
		System.out.println("\n----------- 배열 (char)");
		
		
		for (int i=0; i < arr_ch.length; i++) {
			System.out.println(arr_ch[i]);
		};
		
	}

}
