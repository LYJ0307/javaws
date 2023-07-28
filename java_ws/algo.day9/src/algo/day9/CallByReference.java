package algo.day9;

public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//기본형 변수 : 데이터 값을 저장하는 변수( 메모리 공간)
		//참조형 변수 : 참조값(주소값)을 저장하는 변수
		
		
		int[] arr = {10, 9, 8, 5};
		printArray(arr);		// 배열의 주소값 , 참조값

	}

	public static void printArray(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
	}

}
