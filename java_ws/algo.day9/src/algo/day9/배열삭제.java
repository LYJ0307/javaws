package algo.day9;

public class 배열삭제 {

	public static void main(String[] args) {
		
		// 			 0, 1, 2, 3, 4
		int[] arr = {1, 2, 3, 4, 5};
		// 삭제할 index: 2 (8을 삭제)
		
		int index = 2;
		int[] newArray = new int[arr.length-1];
		
		//배열 삭제
		
		
		for(int i=0; i<index; i++) { // 앞에 1, 2복사
			newArray[i] = arr[i];
		}
		
		
		for(int i=index; i<newArray.length; i++) {
			newArray[i] = arr[i+1]; 	// 뒤에 3, 4 복사
		}
		
		 
		
		

	}

}
