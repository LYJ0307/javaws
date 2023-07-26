package day6;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = new int[3];
		int sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자를 입력하세요: ");
			arr[i] = scan.nextInt();
			
		}
	
	
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+ " ");
			sum += arr[j];
		}
		
		
		System.out.println("합계: "+sum);
		
		
		
		
	}

}
