package day15;

public class CTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		try {
			c.매서드(105);
		} catch (OverNumberExcepton e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			// 예외 발생하든/하지 않든 수행하는 코드
		}
		System.out.println("정상 종료");
	}

}
