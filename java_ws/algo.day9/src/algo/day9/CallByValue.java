package algo.day9;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b = 10;
		int result = adder(a, b);	// 5 , 10
		
		
		int c = 9;	// main에서 만든 c라는 변수
		int result2 = input( c);	// input 함수에서 c의 값을 변화시킬 수 있는가?
					// 변화시키고 싶다면...
		
		c = result2;
	}
	
	
	// call by value
	public static int adder(int su1, int su2) {	// su1 = 5, su2 = 10
		return su1+su2;
	}
	
	
	public static int input(int su) {
		return 5;
	}
}
