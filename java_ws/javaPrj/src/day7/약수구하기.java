package day7;

import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		
		System.out.println("-------- 약수 구하기 ---------");
		
		
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		int cnt = 0;
		
		
		for(int i=1; i<=n; i++) {			
			if (n % i == 0) {
				//System.out.print(i+ " ");
				arr[cnt] = i;
				cnt++;
			}
			
		}
	
		
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i]+" ");
		}
	
		
		
		
	}

}
