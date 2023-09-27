package java2prj1.interfaceEx.myarrays;

import java.util.Comparator;

interface MyComparable<T>{
	public int compareTo(T other);		// 기준이 크면 양수, 적으면 음수, 같으면 0
}


public class MyArrays {
	
	
	public static void sort(Object[] arr) {
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				MyComparable m = (MyComparable) arr[i];
				if ( m.compareTo(arr[j]) > 0) {		//알 수 없음
			  		Object tmp;
			  		tmp = arr[i];
			  		arr[i] = arr[j];
			  		arr[j] = tmp;
			}
		}
		
		
	}
	

}
	// Comparator는 자바가 제공하는 인터페이스
	
	
	/*
	 * 
	 * 
	 * 	interface Comparator{
	 * 		public int compare(Object o1, Object o2);
	 * }
	 * 
	 * 
	 * */
	
	public static void sort(Object[] arr, Comparator c) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				//교환
				if ( c.compare(arr[i], arr[j]) > 0) {
					
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
			
		}
		
	}
	
	
}
