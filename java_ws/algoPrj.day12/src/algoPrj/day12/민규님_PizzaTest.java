package algoPrj.day12;

public class 민규님_PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		민규님_불고기피자  b = new 민규님_불고기피자();
		민규님_Pizza pi = b;	//	b는 100번지, pi는 100번지에 들어감
		
		
		
		b.불고기();
		b.도우();
		b.소스();
		b.치즈();
		b.페퍼로니();
		b.올리브();
		b.양파();
		b.소시지();
		
		
		민규님_Pizza p2 = b; //업캐스팅
		p2.소스();
		
	
		
		민규님_하와이안피자 p = new 민규님_하와이안피자();
		
		
		
		p.파인애플();
		p.도우();
		p.소스();
		p.치즈();
		p.페퍼로니();
		p.올리브();
		p.양파();
		p.소시지();

		
		
		p2 = p;
		p2.올리브();
		
		
		((민규님_하와이안피자)p2).파인애플();
		
		
		
		//잘못된 다운캐스팅
		/*Pizza pi = new Pizza();
		
		
		불고기피자 bi = (불고기피자)pi;
		bi.소스();*/	
		
		
	}
	
	
}
