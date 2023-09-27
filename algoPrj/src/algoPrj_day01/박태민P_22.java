package algoPrj_day01;

public class 박태민P_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 누적은 기본값이 굉장히 중요하다
		int sum=0;
		
		
		for(int n=0; n<=100; n++) {	// 초기식; 조건식; 증감식;
			sum = sum + n *(101-n);
		}
		
		System.out.println(sum);
		
	}

}
