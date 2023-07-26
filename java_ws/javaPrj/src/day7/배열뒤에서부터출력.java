package day7;

public class 배열뒤에서부터출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] temperatures = {27, 28, 29, 8, 32, 33, 32, 31, 31, 33, 33, 31};
		
		
		for(int i= temperatures.length - 1; i >= 0; i--) {
			System.out.println(temperatures[i]);
		}
		
		
	}

}
