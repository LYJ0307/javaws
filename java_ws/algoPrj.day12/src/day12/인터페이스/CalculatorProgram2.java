package day12.인터페이스;

import java.util.Scanner;

public class CalculatorProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//CalculatorI cal = new MyCalculator_ek();
		태민계산기클래스  cal = new 태민계산기클래스();
		
		//태민님 계산기로 쓰고 있으면 의존 관계가 깊다
		//자식들이 재정의를 해야 할 수도 있다
		int result = cal.add태민(num1, num2);
		System.out.println(result);
		
		
		int result1 = cal.sub태민(num1, num2);
		System.out.println(result1);
		
		int result2 = cal.multi태민(num1, num2);
		System.out.println(result2);
		
		
		int result3 = cal.divide태민(num1, num2);
		System.out.println(result3);
	

	}

}
