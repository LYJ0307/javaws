package day14.ioEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/acorn.txt"));
			
			while(true) {
				String data = bf.readLine();
				if ( data == null)break;
				System.out.println( data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}		// 파일 줄로 읽어오기

}
