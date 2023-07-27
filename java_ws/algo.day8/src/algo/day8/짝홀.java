package algo.day8;

import java.util.Scanner;

public class 짝홀 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int odd[] = new int[20];
		int even[] = new int[20];
		
		int odd_num = 0, even_num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			if ( n % 2 == 0 ) {
				even[odd_num] = n;
				even_num++;
			} else {
				odd[even_num] = n;
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
