package java2Ppj1.실습2일차;

import java.util.function.Supplier;

public class SupplierTest {
	
	
	public static void main(String[] args) {

		
		Supplier<String> s1 =	( ) -> {
			return "1. 라면 끓이기";
		};
		
		System.out.println(s1.get());
		
		
		Supplier<String> s2 = new Supplier<>() {

			@Override
			public String get() {
				return "2. 분말 스프를 넣고 물을 끓인다";
			}};
			
			System.out.println(s2.get());	
			
		Supplier<String> s3 = new Supplier<>() {

			@Override
			public String get() {
				return "3. 면을 넣습니다";
			}};
			
			System.out.println(s3.get());	
	
		
		
	}
}
