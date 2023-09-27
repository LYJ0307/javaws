package day4;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("메뉴판을 선택하세요: ");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		switch(n) {
			case 1:
				System.out.print("1. 등록");
				break;
			case 2:
				System.out.print("2. 조회");
				break;
			case 3:
				System.out.print("3. 변경");
				break;
			case 4:
				System.out.print("4. 삭제");
				break;
			default:
				System.out.print("잘못된 입력입니다");
		}

	}

}
