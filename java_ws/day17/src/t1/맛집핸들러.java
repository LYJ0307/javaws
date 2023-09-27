package t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 맛집핸들러 {
	
	
	ArrayList<맛집정보> list2 = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	void run() {
		
		register();
		info();
		select();
		popualr();
		remove();
		update();
		
	}
	
	
	
	void register() {
		System.out.println("--- 맛집 정보 등록 ---");
		
		맛집정보 m = new 맛집정보("한주당", "서울 마포구 서교동", "0507-1367-6698");
		맛집정보 m1 = new 맛집정보("비스트로고트", "서울 마포구 양화로", "0507-1377-0030");
		맛집정보 m2 = new 맛집정보("제일곱창 홍대직영점", "서울 마포구 와우산로", "0507-1379-7047");
		맛집정보 m3 = new 맛집정보("멜팅오브", "서울 마포구 동교로", "0507-1389-2669");
		맛집정보 m4 = new 맛집정보("팻투데이", "서울 마포구 독막로", "0507-1402-7060");
		
		
		
		list2.add(m);
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		list2.add(m4);
		
		
	}
	
	
	
	void info() {		//영화 정보 출력
		
		
		for(맛집정보 m : list2) {
			System.out.println( m);
		}
		
	}
	

	
	
	void select() {
		System.out.println("가고 싶은 맛집을 선택하세요!\n");

		
		loop: while(true) {
			
			int n = sc.nextInt();
	
			switch(n) {
			
			case 1:
				System.out.println("한주당을 선택하셨습니다");
				list2.get(0).updatecnt();
				break;
				
			
			case 2:
				System.out.println("비스트로고트를 선택하셨습니다");
				list2.get(1).updatecnt();
				break;
				
				
			case 3:
				System.out.println("제일곱창 홍대점을 선택하셨습니다");
				list2.get(2).updatecnt();
				break;
		
			
			case 4:
				System.out.println("멜팅오브를 선택하셨습니다");
				list2.get(3).updatecnt();
				break loop;
				
				
			case 5:
				System.out.println("종료되었습니다");
				break loop;
			
			
			}
				
		}	
		
	}
	
	
	void popualr() {
		System.out.println("--- 인기순 정렬 ---");
		
		
		Collections.sort(list2, new Comparator<맛집정보>() {
		
		
		@Override
		public int compare(맛집정보 o1, 맛집정보 o2) {
			return o2.cnt - o1.cnt;
		}});
		
		
		
		info();
		
		
		}
	
	
	
	
	void remove() {
		
		
		System.out.println("---- 리스트 제거 ----");
		
		
		String name = "비스트로고트";
		
		
		for(int i=0; i<list2.size(); i++) {
			
			if (list2.get(i).getName().equals(name)) {
				list2.remove(i);
			}
			
		}
		
		
	
	info();
		
		
	}
	
	
	
	void update() {
		
		System.out.println("---- 내용 바꾸기 ----");
		
		
		String name = "멜팅오브";
		String number = "0507-1339-2666";
		
		
		for(int i=0; i<list2.size(); i++) {
			if (list2.get(i).getName().equals(name)) {
				list2.get(i).setNumber(number);
			}
		}
		
		info();
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		맛집핸들러 m1 = new 맛집핸들러();
		m1.run();

	}

}
