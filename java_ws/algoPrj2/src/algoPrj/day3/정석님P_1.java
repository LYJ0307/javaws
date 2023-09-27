package algoPrj.day3;

public class 정석님P_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//항의 누적합을 출력하는 문제
		
		
		int sum = 0; // 출력변수
		int n=1;
		
		
		while( n <= 99) {
			sum+= n;
			n = n+2;
		}
		System.out.println( n);
	}

}
