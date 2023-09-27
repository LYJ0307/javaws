package day4;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print("반복 횟수 입력: ");
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int i = 1;
	int sum = 0;
	
	
	while(i <= n) {
		System.out.print("값 입력: ");
		int number = scan.nextInt();
		i++;
		sum += number;
	}

	
	System.out.print("더해진 값 출력: " + sum);
	
	}

}
