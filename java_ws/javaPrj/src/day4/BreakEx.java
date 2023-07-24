package day4;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// switch,
		// while, for 반복문에서  break;
		// 자신이 속한 반복문 빠져나옴
		
		// 1~10까지의 합
		
		
		int i = 0;
		int sum = 0;
		
		while(true) {	// 무한 루프, 탈출 조건
			i++;
			sum = sum + i; // sum +=i;
			
			if (i >= 10) break; 
		}
		
		System.out.println( sum);
		
		
	}

}
