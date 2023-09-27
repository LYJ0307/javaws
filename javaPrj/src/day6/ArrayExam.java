package day6;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열합
		// 수를 10개 입력받아 출력 문제, 입력받은 수의 합계 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] number = new int[5];
		int in= 0;
		int cnt = 0;
		
							//공간이 다섯개
		for (int i=0; i < number.length; i++) {
			in = sc.nextInt();
			if (in % 2 == 0) {	// 짝수면		4 % 2 == 0 
				number[cnt] = in;		//number[0] = 4;
										//number[1] = 10;
				cnt++;		// cnt = 2;
			}
			
			System.out.println("");
		}
		
		for (int i=0; i < cnt; i++) {
			System.out.println(number[i]);
		}
		

	}

}
