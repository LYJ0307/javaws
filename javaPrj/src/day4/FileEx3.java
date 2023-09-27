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
			
			fout.write(x); // data2라는 파일에 저장된 값을 가지고 와서 dataCopy2에 저장한다
			
			System.out.println(x);
		}
		
		
	}

}
