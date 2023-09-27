package day20.thread;

public class interuptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ThreadEx th = new ThreadEx();
		th.start();
		
		
		// 메인이 3초 기다린다
		th.interrupt();		// interrupt 발생시킨다
		System.out.println(" 메인 종료");
		
	}

}


class ThreadEx extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(2000);
				//System.out.println( (i+1) + " hi ^^" );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(" 자고 있는데 깨어남");
				return ;
			}
			
			System.out.println( (i+1) + "hi ^^" );
			
			
			if (isInterrupted()) {
				System.out.println("인터럽트 요청 받음");
				return;
			}
			
		}
	}		// 스레드에 interrupt 상황을 알려줌
	
	
}
