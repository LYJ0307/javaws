package 실습;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/name.txt"));
			
			
			while(true) {
				
				String data = bf.readLine();
				if ( data == null) break;
				System.out.println( data);
				
				//data 객체형으로 선언해서 bf.readline 해서 가져오기
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
