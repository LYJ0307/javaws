package day14.ioEx;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 바이트로 읽어옴
		
		
		try {
			int su = System.in.read();
			System.out.println( su);
			su = System.in.read();
			System.out.println( su);
			// keycode
			// '0'  ->  48	(48)
			// '1'  ->  49
			// 'a'  ->  97  (32)
			// 'A'  ->  65
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
