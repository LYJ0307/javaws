package algo.day8;

public class Ex03 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int result = getSum3(n);
		System.out.println(result);
		
		
		int a = result + 10;
		

	}

	public static int getSum3(int n) {	// int로 설정해야 sum값을 출력할 수 있음
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		
		return( sum);
	}

}
