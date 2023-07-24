package day4;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("아이디를 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);
		String id = scan.next();

		
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		
		System.out.print("키를 입력하세요: ");
		int height = scan.nextInt();
		
		
		System.out.println("\n아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);

	}

}
