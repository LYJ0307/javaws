package day7;

public class 최대값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] temperatures = {27, 28, 29, 8, 32, 33, 32, 31, 31, 33, 33, 31};
		int max = temperatures[0];
		
		
		for (int i=0; i<temperatures.length; i++) {
			if (max < temperatures[i]) {
				max = temperatures[i];
			}
		}
		
		System.out.println(max);
	}

}
