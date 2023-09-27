package day19;

public class Program3 {

	public static void main(String[] args) {
		
		
		// 책 정보를 담을 수 있는 변수를 만드는 것
		// 객체라고 부름 (구조가 있는 변수) + 변수를 다루는 매서드
		Book b = new Book("자바의 정석", 28000, "도우출판사");
		b.매서드();		// book 객체의 정보가 this 전달됨 => this라는 참조형 변수가 전달됨
			
		

	}

}
