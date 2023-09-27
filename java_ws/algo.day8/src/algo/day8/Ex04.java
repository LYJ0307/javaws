package algo.day8;

public class Ex04 {

	public static void main(String[] args) {
		
		// 반환 타입 변환
		int[] result = a();
		
		
		for(int i=0; i<result.length; i++) {
			System.out.println( result[i]);
		}

		int[][] result2 = b();	//2차원 배열, b함수 출력
		
		
		for(int i=0; i<result2.length; i++) {
			for (int j=0; j<result2[i].length; j++) {
				System.out.println(result2[i][j]);
			}
			
			System.out.println();
		}
	}
	
	
	//반환은 한 개만 가능하다
	//배열, 객체 (입력은 여러 개가 가능)
	//내 기능의 이름은 a, 반환 type int[]
	//여러개를 반환해야 할 때는 배열, 객체 사용한다
	
	
	public static int[] a() {	// a라는 함수에서 만든 데이터
		
		int[] result = {3, 5};
		return result;
				
	}
	
	
	//배열을 반환하는 입력
	public static int[][] b() {
		int[][] result = { {1,2}, {3,4} };
		return result;
	}

}
