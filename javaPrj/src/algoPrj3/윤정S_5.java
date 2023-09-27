package algoPrj3;

public class 윤정S_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=2;
		int n=2;
		int i=1;
		
		
		while( i < 7) {
			n = n*2 + n;	// 항을 구한다
			sum = sum + n;	//항을 누적한다
			i++;
			
		}
		
		System.out.println(sum);
		
	}

}
