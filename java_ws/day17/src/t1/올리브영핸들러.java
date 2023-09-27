package t1;

import java.util.ArrayList;
import java.util.Scanner;

public class 올리브영핸들러 {
	
	
	
	 ArrayList<올리브영정보> list = new ArrayList<>();
	int sum=0;
	
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		register();
		show();
		select();
		totalprice();
		
	}
	
	
	
	void register() {
		
		
		System.out.println("---- 상품 출력 ----");
		
		올리브영정보 o = new 올리브영정보("필리밀리 히팅 뷰러", "필리밀리", 29900);
		올리브영정보 o1 = new 올리브영정보("구달 청귤 비타C 잡티케어", "구달", 43000);
		올리브영정보 o2 = new 올리브영정보("메이크프렘테카 수딩크림", "메이크프렘", 24500);
		올리브영정보 o3 = new 올리브영정보("에스티 로더 갈색병 세럼 기획", "에스티로더", 105400);
		올리브영정보 o4 = new 올리브영정보("아비브 어성초 카밍 토너 스킨부스터", "아비브", 25900);
		올리브영정보 o5 = new 올리브영정보("성분에디터 그린토마토 포어 리프팅 앰플 플러스", "성분에디터", 25900);
		
		
		list.add(o);
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		list.add(o5);
		
		
	}
	
	
	
	void show() {
		
		for(올리브영정보 o : list) {
			System.out.println( o);
		}
		
	}
	
	
	
	
	void select() {
		
		
		
		System.out.println("---- 구매할 상품 선택, 7번 누르면 구매 종료 ----");
		
		
		
		loop: while(true) {
			
			
			int n = sc.nextInt();
			
			
			switch(n) {
			
			
			case 1:
				System.out.println("필리밀리 히팅 뷰러 구매");
				sum += list.get(0).getPrice();
				list.get(0).popular();
				break;
				
				
			case 2:
				System.out.println("구달 청귤 비타 C 잡티케어 구매");
				sum += list.get(1).getPrice();
				list.get(1).popular();
				break;
				
				
			case 3:
				System.out.println("메이크프렘테카 수딩크림 구매");
				sum += list.get(2).getPrice();
				list.get(2).popular();
				break;
				
			
			case 4:
				System.out.println("에스티 로더 갈색병 세럼 구매");
				sum += list.get(3).getPrice();
				list.get(3).popular();
				break;
				
				
			case 5:
				System.out.println("아비브 어성초 카밍 토너 스킨부스터 구매");
				sum += list.get(4).getPrice();
				list.get(4).popular();
				break;
				
				
			case 6:
				System.out.println("성분에디터 그린토마토 포어 리프팅 앰플 플러스 구매");
				sum += list.get(5).getPrice();
				list.get(5).popular();
				break;
				
			
			case 7:
				System.out.println("----- 구매 종료합니다 -----");
				break loop;
				
			
			}
			
		}
		
		
		

	}
	
	
	
	void totalprice() {
		
		System.out.println("---- 구매 금액 출력 ----");
		System.out.println("금액: " + sum);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		올리브영핸들러 o1 = new 올리브영핸들러();
		o1.run();

	}

}
