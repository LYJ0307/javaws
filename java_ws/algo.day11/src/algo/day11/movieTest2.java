package algo.day11;

public class movieTest2 {

	public static void main(String[] args) {

		
		//생성자는 함수, 매서드 동일, 특별한 매서드
		//이름이 없는 매서드입니다
		//단 한번 new 객체를 생성할 때 객체의 초기화를 담당하는 역할을 가진다.
		// new가 하는 일 : 메모리 할당
		
		
		movieClass M = new movieClass("분노의 질주: 라이드 오어 다이", "action", "2시간 21분", "15세이상");
		movieClass M2 = new movieClass("쥬라기 월드: 도미니언", "action/SF", "2시간 27분", "12세 이상");
		movieClass M3 = new movieClass("서치 2", "thriller", "1시간 51분", "12세 이상");
		
		

		M.printInfo();
		M2.printInfo();
		M3.printInfo();
		
	}

}
