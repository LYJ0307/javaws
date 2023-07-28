package algo.day9;

public class 함수리턴 {

	public static void main(String[] args) {	// 시작
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {9,8,7};
		printArray(arr);	//	호출되면 코드를 수행하고 호출한 쪽으로 돌아옴
	}
	
	// 종료
	
	
	public static void printArray(int[] a) {	// 함수의 시작
		
		/*
		for( int numnber : a) {
			System.out.print( number);;
		}
		*/
	
		//return; 리턴을 만나면 수용할 수 없는 코드임, 다시 돌아감
		
		for( int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}	// 함수의 종료

}
