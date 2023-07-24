package algoPrj.day3;

public class 단야님P_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0; //누적합
		
		int jsum=0;

		// 반복을 제어하는 변수
		int i=1;	// j=0
		
		
		final int MAX = 5;
		
		
		
		// i = 1  2  3  4  5  6  7  8  9 . . . 10
		// j = 1  2  3  4  5  6  7  8  9 . . . 10
		//	   1  (1+2)  (1+2+3)  (1+2+3+4)  (1+2+3+4+5)
		//	   1   3      6         10          15
		
		
		while( i<= MAX ) {
			jsum = jsum + i;  // jsum이 항을 구하는 변수
			sum = sum  +  jsum;
			i++;	
		}
		
		
		System.out.print(sum);
		
		
		
	}

}
