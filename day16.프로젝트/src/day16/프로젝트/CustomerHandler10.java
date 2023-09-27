package day16.프로젝트;

import java.util.ArrayList;

public class CustomerHandler10 {
	
	
	ArrayList<Customer1>list = new ArrayList<>();
	
	
	void run() {
		register();
		search();
		update();
		search();
		remove();
		search();
		
	}
	
	
	public void search() {
		System.out.println("---- 회원 조회 ----");
		
		
		for(int i=0; i<list.size(); i++) {
			Customer1 c = list.get(i);
			System.out.println( c);
		}
		
	}
	
	
	
	public void update() {
		System.out.println("--- 회원 업데이트 ---");
		
		
		String name = "이윤정";
		String newPhone = "010-555-4444";
		
		
		
		String name1 = "이윤";
		String newadd = "런던";
		
		
		
		for(Customer1 c : list) {
			if (c.getName().equals(name)) {
				c.setPhone(newPhone);
			}
		}
		
	
		
		for(Customer1 c : list) {
			if (c.getName().equals(name1)) {
				c.setAddress(newadd);
			}
		}
		
		
	}
	
	
	
	
	public void remove() {
		
		
		System.out.println("---- 회원 삭제 ----");
		
		
		String name = "이윤";
		
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
			}
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
		// TODO Auto-generated method stub

		CustomerHandler10 c1 = new CustomerHandler10();
		c1.run();
		
	}

}
