
import java.util.Scanner;

public class MyClass_실행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.print("수 입력: ");
		Scanner sc = new Scanner(System.in);
		int su2 = sc.nextInt();
		
		MyClass m = new MyClass();
		String result  =m.getTotal(su2);
		
		System.out.println(result);
		
		

	}

}
