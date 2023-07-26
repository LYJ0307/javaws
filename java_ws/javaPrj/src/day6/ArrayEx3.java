package day6;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = sc.nextInt();
		arr[2] = 5;
		
		
		a = 10;
		b = sc.nextInt();
		c = 5;
		
		
		System.out.println(a); // 10
		System.out.println(b); // 입력받은 값
		System.out.println(c);	// 5
		System.out.println( arr[0]); // 10
		System.out.println( arr[1]); // 입력받은 값
		System.out.println( arr[2]); // 5

	}

}
