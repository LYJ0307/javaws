package java2prj1.day3.collection;

import java.util.Scanner;

public class SimplePro {
	
	//의존성 dependency
	private CalculatorI cal;
	

	//dependency Injection
	public void setCal(CalculatorI cal) {
		this.cal = cal;
	}

	
	public void run() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 프로그램 ");
		
		
		System.out.print("첫 번째 수 : ");
		int su1 = sc.nextInt();
		
		
		System.out.print("두 번째 수 : ");
		int su2 = sc.nextInt();
		
		
		int result = cal.add(su1, su2);
		System.out.println( result);
		

	}
	
	
	public static void main(String[] args) {
		
		
		SimplePro p = new SimplePro();
		p.setCal(new SMCalculator());
		p.run();
		
	}

}
