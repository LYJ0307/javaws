package day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FiileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 기반 스트림 (읽어올 수 있는 기능을 가진 애)
		try {
			FileInputStream fis = new FileInputStream("res/test.txt");
			int data1 = fis.read(); // 1byte씩 읽음
			System.out.println( (char) data1);
			
			
			data1 = fis.read();
			System.out.println( (char) data1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
