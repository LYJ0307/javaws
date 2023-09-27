package algo.day9;

import java.util.Scanner;

public class 실습과제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sch[] = new String[10];
		
		int index = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		loop: while (true) {
			
			System.out.println("1. 등록  2. 조회");
			
			String n_ = sc.nextLine();
			int n = Integer.parseInt(n_);
			
			
			switch(n) {
			
			case 1:
				index = Insert(sch, index, sc);
				break;
			
			
			case 2 :
				Select(sch, index);
				
				break loop;
				
			}
			
			
		}
		
		

	}

			public static void Select(String[] sch, int index) {
				System.out.println("일정을 조회합니다");
				
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"번 "+sch[i]);
				}
			}
		
			public static int Insert(String[] sch, int index, Scanner sc) {
				System.out.println("일정을 등록하세요");
				String sch1 = sc.nextLine();
				sch[index] = sch1;
				index++;
				return index;
			}

}
