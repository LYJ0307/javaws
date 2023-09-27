package day7;

import java.util.Scanner;

public class 화폐단위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m_50000, m_10000, m_5000, m_1000, m_500, m_100, m_50, m_10;
		
		System.out.println("---- 화폐 단위 ------");
		
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		
		
		m_50000 = money / 50000;
		System.out.println("5만원권 : "+m_50000);
		money = money % 50000;
		System.out.println(money);
		
		
		m_10000 = money / 10000;
		System.out.println("1만원권 : "+m_10000);
		money = money % 10000;
		System.out.println(money);
		
		
		m_5000 = money / 5000;
		System.out.println("5천원권: " + m_5000);
		money = money % 5000;
		System.out.println(money);
		
		
		m_1000 = money / 1000;
		System.out.println("1천원권: " + m_1000);
		money = money % 1000;
		System.out.println(money);
		
		
		m_500 = money / 500;
		System.out.println("500원: " + m_500);
		money = money % 500;
		System.out.println(money);
		
		
		m_50 = money / 50;
		System.out.println("50원: " + m_50);
		money = money % 50;
		System.out.println(money);
		
		
		m_10 = money / 10;
		System.out.println("10원: " + m_10);
		money = money % 10;
		System.out.println(money);
		
	}

}
