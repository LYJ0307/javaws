package com.acorn.yj;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = Calculator.add(5, 10);
		int result1 = Calculator.sub(10, 8);
		int result2 = Calculator.mul(15, 8);
		int result3 = Calculator.div(20, 5);
		
		
		System.out.println("더하기: " + result);
		System.out.println("빼기: " + result1);
		System.out.println("곱하기: " + result2);
		System.out.println("나누기: "+result3);

	}

}
