package day7;

import java.util.Scanner;

public class 화폐단위구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("----- 화폐 구하기 ------");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int[] cnt = new int[8];
		
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		
		
		for(int i=0; i<cnt.length; i++) {
			cnt[i] = n / money[i];
			n = n % money[i];
			System.out.println(money[i] + "권 : " + cnt[i]);
		}
		
	}

}
