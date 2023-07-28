package algo.day9;

import java.util.Scanner;

public class 짝홀 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd[] = new int[10];
		int even[] = new int[10];
		
		int odd_n=0, even_n = 0;
		
		
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		for(int i=0; i<=n; i++) {
			
			if (i % 2 == 0) {
				even[even_n] = i;
				even_n++;
				
			} else {
				odd[odd_n] = i;
				odd_n++;
			}
			
		}
		
		
		for(int i=0; i<odd.length; i++) {
			System.out.println("홀수 = "+odd[i]);
		}
		
		
		for(int i=0; i<even.length; i++) {
			System.out.println("짝수 = "+even[i]);
		}
		
	}

}
