package day7함수;

public class Ex03 {

	
	//함수: 약속된 함수 (프로그램을 실행하고 싶으면 반드시 main  함수)
	public static void main(String[] args) { // 시작
		// TODO Auto-generated method stub
		
		printTitle();	// 함수 호출 (호출하지 않은 코드는 실행이 안 됨)
		
	}// 종료
	
	
	// 함수 : 특정 기능을 수행하는 코드 블럭
	// printTitle : 함수명 (기능이름 : 기능에 맞게 이름을 작성)
	// 기능 : 성적표의 타이틀 출력하는 기능
	// 입력 : 입력으로 받는 값
	// 반환값 : 기능을 수행하고 반환하는 값
	
	
	//함수 사용 : 함수 호출 이용해서 함수 코드 실행함, () 괄호 반드시 사용
	//함수 호출 예시 ) printTitle();
	
	public static void printTitle() {
		System.out.println("===== 성적표 ======");
		System.out.println("=================");
		System.out.println("=================");
	}

}
