package algo.day8;

import java.util.Scanner;

public class Ex08 {
	
	
			static String[] days = new String[10];
			static Scanner sc = new Scanner(System.in);
			static int index = 0;

			
			public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				
				loop: while( true) {
					System.out.println("메뉴 선택: 1. 등록, 2. 조회, 3. 변경, 4. 삭제, 5. 종료");
					String menu_ = sc.nextLine();
					int menu = Integer.parseInt(menu_);
					
					switch( menu) {
					case 1:
						index = insertDays(days, sc, index);
						break;
						
					case 2:
						selectDays(days, index);
						break;
						
					case 3:
						System.out.println("변경");
						
						selectDays(days, index);
						
						System.out.println("변경할 순번과 내용을 입력하세요");
						
						String updateIndex_ = sc.nextLine();
						int updateIndex = Integer.parseInt(updateIndex_);
						
						String updateDay = sc.nextLine();
						
						days[updateIndex-1] = updateDay;		// 사용자한테 1번째 놀러가기 선택하기를 보여 주기 위하여
						// 1. 공부하기
						
						break;
					case 4:
						System.out.println("삭제");
						
						selectDays(days, index);
						
						
						deleteDay(days, sc);
						
						break;
					case 5:
						System.out.println("종료");
						break loop;	// loop를 걸면 끝남
					default:
						System.out.println("잘못된 입력입니다");
					}	// while
					
				}
				
				//
				System.out.println("bye");

			}

				public static void deleteDay(String[] days, Scanner sc) {
					System.out.println("삭제하고 싶은 일정을 선택하세요");
					String deleteIndex_ = sc.nextLine();
					int deleteIndex = Integer.parseInt(deleteIndex_);
					days[deleteIndex-1]="";
				}

				public static int insertDays(String[] days, Scanner sc, int index) {
					System.out.println("일정을 입력하세요");
					String day = sc.nextLine();
					days[index] = day;
					index++;
					return index;
				}

				public static void selectDays(String[] days, int index) {
					System.out.println("일정을 조회합니다. ");
					for (int i=0; i < index; i++) {
						System.out.println( days[i]);
					}
				}


	}


