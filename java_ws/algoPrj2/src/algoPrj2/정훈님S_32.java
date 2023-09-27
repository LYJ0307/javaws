package algoPrj2;

public class 정훈님S_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a=b=1;
		
		int n=2; // 필요한 수 2개를 구했으니 2;
		final int MAX = 10;
		
		System.out.println(a + " " + b);
		
		while(true) {
			
			a = a+b;
			n = n+1;
			
			System.out.println(a);
			if( n > MAX) break;
			
			b=a+b;
			n=n+1;
			
			System.out.println(b);
			if (n > MAX) break;
			
			if(n > 50) {
				
			}
			
			
		}
		
		
	}

}
