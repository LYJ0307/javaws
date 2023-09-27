package algo.day9;

import java.util.Scanner;

public class 실습과제04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sch[] = new String[20];
		
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
	
		
		
		
		loop: while(true) {
			
			
			System.out.println("1. 등록  2. 조회  3. 변경  4. 삭제  5. 종료");
			
			String n_ = sc.nextLine();
			int n = Integer.parseInt(n_); 
			
			
			switch(n) {
		
			
			case 1:
				index = insert(sch, index, sc);
				break;
				
			
			case 2:
				select(sch, index);
				break;
				
		
			case 3:
				System.out.println("일정을 변경합니다");
				
				change(sch, index, sc);
			
				break;
				
				
			
			case 4:
				System.out.println("일정을 삭제합니다");
				
				delete(sch, index, sc);

				break;
				
				
			case 5:
				System.out.println("종료");
				break loop;
				
				
			default:
				System.out.println("잘못된 입력입니다");
				
				
				}
				
			
			}
			
		}

			public static void delete(String[] sch, int index, Scanner sc) {
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"번: "+sch[i]);
				}
				
				System.out.println("삭제하고 싶은 일정 입력");
				String choiceIndex = sc.nextLine();
				int choice = Integer.parseInt(choiceIndex)-1;	// 0 1 2 입력판 중 고르기
				sch[index-1] = "";
			}
		
			public static void change(String[] sch, int index, Scanner sc) {
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"번: "+sch[i]);
				}
				
				
				String updateIndex = sc.nextLine();   //1 
				int update = Integer.parseInt(updateIndex)-1;  // 1-1  =>0 
				
				String part = sc.nextLine(); //"자바" 
				sch[update] = part;   // sch[0]= "자바"
			}
		
			public static void select(String[] sch, int index) {
				System.out.println("일정을 조회합니다");
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"번: "+sch[i]);
				}
			}
		
			public static int insert(String[] sch, int index, Scanner sc) {
				System.out.println("일정을 등록합니다");
				String sch1 = sc.nextLine();
				sch[index] = sch1;
				index++;
				return index;
			}

	}


