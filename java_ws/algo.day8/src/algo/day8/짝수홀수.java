package algo.day8;

import java.util.Scanner;

public class 짝수홀수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] odd = new int[5]; // 50까지의 홀수를 넣음
		int[] even = new int[5]; // 50까지의 짝수를 넣음
		int odd_num = 0, even_num = 0;
		
		
		for(int i=1; i<=10; i++) {
			if ( i % 2 == 0) {
				even[even_num] = i;
				even_num++;
			} else {
				odd[odd_num] = i;
				odd_num++;
			}
		}
		
		
		for(int i=0; i<odd.length; i++) {
			System.out.println("홀수: "+odd[i]);
		}
		
		
		for(int i=0; i<even.length; i++) {
			System.out.println("짝수: "+even[i]);
		}
		

	}

}
