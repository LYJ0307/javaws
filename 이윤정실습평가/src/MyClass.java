



import java.util.Scanner;

public class MyClass {
	
	
	
	public String getTotal(int su2) {
		
		int sum = 0;
		
		for(int i=1; i<=su2; i++) {
			sum += i;
		}
		
		return "1부터 입력된 수까지의 합: " + sum;
	}

}
