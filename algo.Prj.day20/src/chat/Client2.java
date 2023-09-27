package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	
	
	
	Socket s;
	
	
	DataInputStream dis;
	DataOutputStream dos;
	
	
	
	public Client2() {
		try {
			s = new Socket("localhost", 6000);
			System.out.println(" 서버에 요청 !!");
			
			
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			
			// 보내기
			
			dataSend();
			
			
			//받기
			dataRecv();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	private void dataRecv() {
		try {
			String message = dis.readUTF();
			System.out.println( message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("메시지 작성: ");
			String message = sc.nextLine();
			dos.writeUTF(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}




	public static void main(String[] args) {
		
		Client2 c = new Client2();

	}

}
