package day4;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		loop: while(true) {
			
			System.out.print("일정 관리 프로그램, 숫자를 선택하세요: ");
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			switch(n) {
				case 1:
					System.out.println("등록입니다");
					break;
				case 2:
					System.out.println("조회합니다");
					break;
				case 3:
					System.out.println("변경합니다");
					break;
				case 4:
					System.out.println("삭제합니다");
					break;
				case 5:
					System.out.println("종료");
					break loop;
				default:
					System.out.println("잘못된 선택입니다");
			}
			
		}
		
		
		
		
		
	}

}
