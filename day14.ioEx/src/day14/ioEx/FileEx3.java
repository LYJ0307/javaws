package day14.ioEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//파일에서 문자 단위로 읽기
		
		
		try {
			InputStreamReader fis = new FileReader("res/acorn.txt");
			
			try {
				fis = new FileReader("res/acorn.txt");
				int data = fis.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			
		}
		

	}

}
