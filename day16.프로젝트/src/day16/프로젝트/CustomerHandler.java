package day16.프로젝트;

import java.util.ArrayList;

public class CustomerHandler {
	
	
	ArrayList<Customer연습> list = new ArrayList<>();
	
	
	void run() {
		
		
		register();
		search();
		update();
		search();
		remove();
		search();
		
		
	}
	
	
	public void search() {
		System.out.println("--- 회원 출력 ---");
		
		for(Customer연습 c : list) {
			System.out.println( c);
		}
		
	}
	
	
	
	public void register() {
		System.out.println("--- 회원 등록 ---");
		
		Customer연습 c1 = new Customer연습("이윤정", "010-1111-2222", "부천시", 230508);
		Customer연습 c2 = new Customer연습("이윤", "010-5555-6666", "홍대입구", 230610);
		Customer연습 c3 = new Customer연습("조은경", "010-4444-7777", "인천시", 230809);
		
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
	}
	
	
	
	public void update() {
		System.out.println("--- 회원 업데이트 ---");
		
		
		String name = "이윤정";
		int neworder = 230810;
		
		
		for(Customer연습 c : list) {
			if (c.getName().equals(name)) {
				c.setOrder(neworder);
			}
		}
		
		
	}
	
	
	
	
	public void remove() {
		System.out.println("--- 회원 삭제 ---");
		
		
		String name = "조은경";
		
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CustomerHandler ch = new CustomerHandler();
		ch.run();
		

	}

}
