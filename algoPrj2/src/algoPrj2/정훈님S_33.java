package algoPrj2;

public class 정훈님S_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a, b;	// a=1, b=1
		a = b=1;
		int n = 2;
		final int MAX = 50;
		
		
		System.out.println(a + " " + b);
		
		
		while(n < MAX) {
			b = a+b;
			a = b-a; //기억장치 2개로 피보나치 수열 만들기
			n = n+1;
			System.out.println(b);
		}
		
	}

}
