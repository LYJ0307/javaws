package day14.ioEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//기반스트리 얻어오기
			//파일 읽어오기
			FileWriter w = new FileWriter("res/output.txt");	//파일 자체를 생성
			w.write("안녕하세요");
			w.flush();	//대상에 파일을 보낸다
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
