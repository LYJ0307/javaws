package day14.ioEx;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//입출력 스트림
		// 입력스트림		(데이터가 들어오는 길  (입력전용 메모리버퍼)
		// 출력스트림		(데이터가 나가는 길   (출력전용 메모리버퍼)
		
		
		//기반스트림(실제로 데이타를 읽고 쓰고 하는 기능)
		//보조스트림(부가기능)
		
		
		try {
			int su = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//보조스트림이 필요해짐
		
		
		// 한 문자를 읽는 보조스트림을 사용함
		//InputStreamReader ir = new InputStreamReader(System.in);
		
		
		

	}

}
