package java2Ppj1.실습2일차;

public class BucketListRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runnable r1 = () -> System.out.println("코딩 천재 되기");
		Runnable r2 = () -> System.out.println("40대에 파이어족 되기");
		Runnable r3 = () -> System.out.println("쉽지 않네......");
		

		r1.run();
		r2.run();
		r3.run();
		
	}

}
