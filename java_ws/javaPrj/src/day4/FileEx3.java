package day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("res/data2.txt");
		FileOutputStream fout = new FileOutputStream("res/dataCopy2.txt");
		
		int x;
		
		
		while ((x = fin.read()) !=  -1) {
			//파일의 끝까지 불러온다
			
			fout.write(x);
			
			System.out.println(x);
		}
		
		
	}

}
