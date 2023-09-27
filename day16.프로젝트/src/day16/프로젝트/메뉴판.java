package day16.프로젝트;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class 메뉴판 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		System.out.println("1. 한식   2. 중식   3. 양식   4. 프로그램 종료");
		Scanner sc = new Scanner(System.in);
		
		loop: while(true) {
			
			int n = sc.nextInt();
			
			switch(n) {
			
			
			case 1:
				System.out.println("-----  1. 한식  ------");
				
				
				BufferedReader rd = new BufferedReader(new FileReader("res/koreafood.txt"));
				
				String str;
				while((str = rd.readLine()) != null) {
					System.out.println(str);
				}
				
				rd.close();
				
				break;
				
			
			case 2:
				System.out.println("--- 2. 중식 ---");
				
				
				
				BufferedReader rd1 = new BufferedReader(new FileReader("res/chinesefood.txt"));
				
				String str1;
				
				while((str1 = rd1.readLine()) != null) {
					System.out.println(str1);
				}
				
				
				rd1.close();
				
				break;
				
				
			case 3:
				System.out.println("--- 3. 양식 ---");
				break;
			
			case 4:
				System.out.println("--- 프로그램 종료 ---");
				break loop;
			
			
			}
			
			
			
			
			
		}

	}

}
