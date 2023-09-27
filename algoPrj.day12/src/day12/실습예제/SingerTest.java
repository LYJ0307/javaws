package day12.실습예제;

public class SingerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sing[] sing = new Sing[3];
		
		
		sing[0] = new IVE();
		sing[1] = new NJS();
		sing[2] = new NMIXX();
		
		
		
		System.out.println("---- 노래 시작합니다 ----");
		
		
		for(int i=0; i<sing.length; i++) {
			sing[i].Singer();
			
		}

	}

}
