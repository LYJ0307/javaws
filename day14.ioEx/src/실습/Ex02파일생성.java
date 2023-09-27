package 실습;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02파일생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileWriter w = new FileWriter("res/fruits.txt");
			
			
			w.write("딸기\n");
			w.write("포도\n");
			w.write("바나나\n");
			w.write("오렌지\n");
			w.write("수박\n");
			w.write("오렌지\n");
			
			w.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
