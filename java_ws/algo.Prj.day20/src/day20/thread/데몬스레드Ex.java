package day20.thread;

public class 데몬스레드Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					try {
						Thread.sleep(10);
						System.out.println((i+1) + " hi ^^");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		// th.setDaemon(true);
		th.start();
		
		
		System.out.println(" 메인 종료");

	}
	
	
	//데몬, 워드프로세스의 자동저장 기능

}
