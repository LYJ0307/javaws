package day7;

public class 평균기온출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] temperatures = {27,27,28,29,30,33,32,33,32,31,31,33,33,31};
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}
		
		
		System.out.println("평균 기온은 " + (avg = sum / temperatures.length));
		
	}

}
