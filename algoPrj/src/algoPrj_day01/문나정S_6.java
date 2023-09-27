package algoPrj_day01;

public class 문나정S_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//코드 작성
		// double 자료형은 변수를 만드는데 실수가 들어가는 공간을 만드는 것
		
		double sum = 0;	// 항의 누적합, double은 실수형
		int multi = 1; // 분모
		int i = 1;  //  항의 순번(반복제어변수)이자 분자
		
		final int MAX = 10;
		int a = -1;		// 부호를 구할 변수
		
		
		sum += multi; //sum = sum + multi;
					// sum = multi;
		
		
		while(i <= MAX) {
			i = i+1;
			multi  = i* multi;
			sum = sum + (a*(i/(double)multi));
			System.out.println(sum);
			a = -a;	// a* -1;
		}
		
		System.out.println( sum );
		
		
		double result =  3 / 6.0;  // 정수/정수   => 정수 6분의 3
		System.out.println("result = "+result);
		
		
		// 정수 / 정수  => 정수
		// 정수 / 실수  => 실수
		
	}

}
