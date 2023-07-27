package algo.day8;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//지역변수 : 함수 안에서 만든 변수는 그 함수 안에서 유효하다.
		//변수의 유효범위
		//main에서 만든 변수는 main에서만 유효하다
		
		
		String[] days = new String[3];			//인자정보,	변환 정보 활용
		
		
		int i = 0;
		insertDay(days, i);
		selectDay(days);
		System.out.println(days[0]);
		
		
		System.out.println(days[i]);
		
		
		
	}
	
	
	public static void selectDay(String[] days) {
		for(String day : days) {
			System.out.println(day);
		}
	}

	public static void insertDay(String[] a, int index) {
			a[index] = "놀러가기";
	}

}
