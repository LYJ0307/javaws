
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("구구단 출력: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();	
		
		
		for(int i=num; i<=num; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+num*j);
			}
		}
		
		

	}

}
