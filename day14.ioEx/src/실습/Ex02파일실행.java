package 실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02파일실행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/fruits.txt"));
			
			
			while( true) {
				
				String data = bf.readLine();
				if ( data == null) break;
				System.out.println( data);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
