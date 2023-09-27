package day16.프로젝트;

import java.util.ArrayList;

public class CustomerHandler1 {
	
	
	ArrayList<Customer1> list = new ArrayList<>();
	//메인함수 위쪽에 있으면 static이나 public 쓰기
	
	
	//
	void run() {
		register();
		search();		
		update();
		search();
		remove();
		search();
	}
	
	
	private void update( ) {
		System.out.println("---- 회원 정보 수정 ----");
		  String name="이윤정";
		  String  newPhone="010-9991-2220" ;
		  
		  
		  String name1 = "조은경";
		  String newadd = "인천";
		
		  
		  // 유효성 검사
		for( Customer1  c: list) {
			if( c.getName().equals(name)) {
				c.setPhone(newPhone);
			}
		}
		
		// 변경까지 완료
		for(Customer1 c : list) {
			if (c.getName().equals(name1)) {
				c.setAddress(newadd);
			}
		}
		
		
	}
	
	
	public void remove() {
		System.out.println("---- 회원 정보 삭제 ----");
		
		
		 String name1 = "조은경";
		 
		 String np1="010-9991-2220";
		 
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getName().equals(name1)) {
				list.remove(i);
			}
		}
		
		
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getPhone().equals(np1)) {
				list.remove(i);
			}
		}
		
		
		
		}
		
		
		
	
	
	 
	


	public void search() {
		System.out.println("---- 회원 조회 ----");
		
		
		for(int i=0; i<list.size(); i++) {
			Customer1 c = list.get(i);
			System.out.println( c);
		}
		
	}
	
	
	
	
	
	
	public void register() {
		System.out.println("---- 회원 등록 ---- ");
		Customer1 c = new Customer1("이윤정", "010-111-222", "서울시");
		Customer1 c1 = new Customer1("조은경", "010-333-444", "경기도");
		Customer1 c2 = new Customer1("이윤", "010-555-666", "홍대입구");
		list.add(c);
		list.add(c1);
		list.add(c2);
	}
	
	
	
	
	public static void main(String[] args) {
		CustomerHandler1 c1 = new CustomerHandler1();
		c1.run();

		
	}
	
	

}
