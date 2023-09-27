package algo.day8;

import java.util.Scanner;

public class 함수실습 {
	
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("두 수의 합: "+add(5, 10));
		System.out.println("");
		star();
		System.out.println("");
		makestar();
		System.out.println("");
		text();
		System.out.println("");
		money(35200);
		
	}
	
	
	public static int add(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		
		return sum;
	}
	
	
	public static void star() {
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	public static void makestar() {
		
		System.out.print("원하는 갯수의 별을 입력: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {	//행
			
			for(int j=1; j<i+1; j++) {	//열
				System.out.print("*");
			}
			
			System.out.println("");
			
		} 
	}
	
	
	public static void text() {
		System.out.println("안녕하세요");
	}
	
	
	public static void money(int in) {
		
		int[] m = new int[8]; //비어 있는 배열을 가지고 오기
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		
		
		for(int i=0; i<m.length; i++) {
			m[i] = in / money[i];
			in = in % money[i];
			
			System.out.println(money[i]+"개수는 " + m[i] + "개다");
		}
		
		
	}

}
