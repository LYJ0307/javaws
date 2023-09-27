package day14.ioEx;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileEx9 {

	public static void main(String[] args) {
		
		
		
		try {
			//object인 것만 읽어와서 출력
			ObjectInputStream oi = new ObjectInputStream( new FileInputStream("res/output2.txt"));
			
			while(true) {
				Score s = (Score)oi.readObject();
				System.out.println(s);
			}	//object 파일에 있는 것을 가지고 옴
			
		
		}catch(EOFException e) {
		    	  System.out.println(" 다 읽었음");	// 다 읽어옴, 문자열이 아니니까 객체로 저장됐으니 객체로 가지고 옴
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
