package day7;

public class 평균기온보다높은온도출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  temperatures = { 27,27,28,29,30,33,32,33,32,31,31,33,33,31} ;
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		
		for (int i=0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}
		
		avg = sum / temperatures.length;
		
		
		for (int i=0; i < temperatures.length; i++) {
			if ( avg < temperatures[i]) {
				cnt++;
			}
		}
		
		
		
		System.out.println("기온들의 합: "+sum);
		System.out.println("평균 기온: "+avg);
		System.out.println("평균 일수보다 높은 날: "+cnt);
	
		
	}

}
