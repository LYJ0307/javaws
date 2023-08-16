package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server00 {

	ServerSocket  ss;
	Socket s;
	
	//보조스트림
	DataInputStream dis;
	DataOutputStream dos;
	
	public Server00() {
		try {
			ss = new ServerSocket(8000);
			// 대기상태로 넘어감, client  요청이 발생하면   client와 통신할 수 있는  소켓을 생성해서 반환합니다.
			System.out.println(" server start !!!");
			
			
			// 소켓 두 개의 기반 스트림이 있음
			
			
			s=ss.accept();
			System.out.println(" client 요청 수락");
			
			
			dis = new DataInputStream( s.getInputStream());
			dos = new DataOutputStream( s.getOutputStream());
			
			
			//받기
			dataRecv();
			
			//보내기
			dataSend();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
	
	
	
	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		
		
		Thread t = new Thread( new Runnable() {
		
		@Override
		public void run() {
			
			
		while(true) {
		try {
			System.out.print("윤정: ");
			String message = sc.nextLine();
			dos.writeUTF(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		}});
		t.start();
		}
	



	private void dataRecv() {
		
		/*
			while(true) {
				String message;
				try {
					message = dis.readUTF();
					System.out.println( message);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		*/
		
		Thread t = new Thread( new Runnable() {

			@Override
			public void run() {
				while(true) {
					String message;
					try {
					message = dis.readUTF();
					System.out.println( message);
				} catch (IOException e) {
					e.printStackTrace();
					}
				}
				
			}});
		t.start();
		
		} 
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Server00 s= new Server00();

	}

}
