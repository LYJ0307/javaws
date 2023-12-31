package java2prj1.lamda;

import java.util.function.Function;

/*
 * 
 * 
 * interface Function<T, R> {
 * 		R apply( T);
 * }
 * 
 * 
 * 
 * 
 * */


public class FuctionTest {

	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f1 = su -> su*2;
		
		
		int result1 = f1.apply(10);
		System.out.println( result1);
		
		
		Function<Integer, Integer> f3 = new Function<>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*2;
			}

		};
		
		
		int result2 = f3.apply(1000);
		System.out.println( result2);
		
		
		
		
		Function<Integer, String>  f4 = num -> {
			String re = "";
			
			for(int i=1; i<num; i++) {
				re+="람다 좋아";
			}
			
			return re;
			
		};
		
		
		String re3 = f4.apply(2);
		System.out.println( re3);
		
		
		String re4 = f4.apply(1);
		System.out.println( re4);
		

	}

}
