package day20.thread;

public class 조인Ex2 {

	public static void main(String[] args) {
		
		
		Thread th = new Thread( new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<100; i++) {
				try {
					Thread.sleep(1000);
					System.out.println((i+1) + " hi ^^");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}});
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" 메인 종료");
		
	}
	
	
	//////

}
