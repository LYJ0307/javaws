package day4;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			System.out.print("짝수의 합 구하기: ");
			int number = sc.nextInt();
			
			
			if (number % 2 == 0) {
				sum += number;
			}
		}
		
		System.out.println("짝수의 합은 " + sum);

	}

}
