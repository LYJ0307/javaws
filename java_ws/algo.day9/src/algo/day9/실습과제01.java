package algo.day9;

import java.util.Scanner;

public class 실습과제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = new String[10];
		int arry[] = new int[5];
		
		int index = 0;
		
		
		
		Scanner sc = new Scanner(System.in);
	
		
		
		while(true) {
			
			System.out.println("1. 등록  2. 조회");
			String n_ = sc.nextLine();
			int n = Integer.parseInt(n_);
			
			switch(n) {
			
			
			case 1:
				System.out.println("등록합니다");
				String str = sc.nextLine();				
				arr[index] = str;
				index++;
				break;
				
			
			case 2:
				System.out.println("조회합니다");
			
				for(int i=0; i< index; i++) { // index 길이만큼 출력
					System.out.println(arr[i]);
				}
					break;
				
				
				}
			
			}
			
		}
		
		
	}


