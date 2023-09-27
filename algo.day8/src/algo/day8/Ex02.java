package algo.day8;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// 1~입력받은 수까지의 합
		
		
			int n = 100;
		
			getSum2(n);

		
		
	}

	public static void getSum2() {
		
		int sum = 0;
		int n = 5;
		
		
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		
		
		System.out.println(sum);
	}

					//	void	=>	반환값이 없다
					// 반환type 함수명 		//(입력정보)
	public static void getSum(int n) {
		
		int sum = 0;
		
		getSum2(sum);
	}

					public static void getSum2(int sum) {
						for (int i=1; i<10; i++) {
							sum += i;
						}

						
						System.out.println(sum);
					}

}
