package java2prj1.lamda;

public class RunnableTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 	interface Runnable{
		 * 			void run();
		 * }
		 * */
		
		Runnable r = () -> System.out.println("람다식 좋아요!");
		r.run();
		
		
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println( "Runnable 인터페이스를 익명으로 구현");
				
			}};
			
			
			r2.run();
			
		
		class B implements Runnable{

			@Override
			public void run() {
				System.out.println(" Runnable 인터페이스를 이름 있는 클래스로 구현함");
			}
		}
		
		
		B b = new B();
		b.run();
		
		
		//람다식으로 실행하고 싶은 코드
		Runnable r3 = () -> {
			
			//실행하고 싶은 코드
			
			for(int i=1; i<=9; i++) {
				System.out.println(5*i);
			}
			
		};
		
		
		r3.run();
		
		
		
		Runnable lyj = () -> {
			
			System.out.println("o(*￣▽￣*)ブ 파이팅입니다");
			
		};
		
		
		lyj.run();

	}

}
