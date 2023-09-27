package day13.ObjectEx;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B(5);
		B b2 = new B(5);
		
		
		// 두 개의 객체가 만들어진 것
		
		
		// true, false  =>  생각하기
		// 민규님 출력 X
		// 나정님 출력
		// 재혁님 출력 X 잘 모르겠다
		
		if(b1.equals(b2)) {	//b1, b2
			System.out.println("두 객체는 같습니다");
		} 
		
		
		// Object의 equals()는 객체의 래퍼런스를 비교합니다.
		//객체가 참조 중인 주소를 비교
		
		

	}

}
