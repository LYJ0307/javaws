package day12.상속;

public class 재혁님_상속연습 {

	public static void main(String[] args) {
		//Person p = new Person();	// 불가능하다, 기본 생성자가 없으므로 불가능
		
		Person p = new Person("허재혁", "h100");
		
		Student s = new Student("김민규", "k100", 1);
		
		System.out.println(s.toString());
		

	}

}
