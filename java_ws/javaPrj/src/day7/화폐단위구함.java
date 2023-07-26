package day7;

import java.util.Arrays;
import java.util.Scanner;

public class 화폐단위구함 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("---- 화폐 단위 구하기 ----");
		
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		
		int n[] = new int[8];
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		
		
		for(int i=0; i<n.length; i++) {
			n[i] = input / money[i] ;
			input = input % money[i];
			//input %= money[i];
			System.out.println(money[i]+" 매수: " + n[i]+ "장");
			
		}
		

		
		System.out.println(Arrays.toString(n));
		
	}

}
