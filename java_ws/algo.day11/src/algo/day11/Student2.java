package algo.day11;



// 학생 한명이 가져야 할 정보를 표현하기 위한 자료형

public class Student2 {
	
	
	String name;
	int kor;
	int eng;
	double avg;
	static String teacher = "우주연";		// 클래스 변수: 클래스 안에서 하나만 만들어짐
								// 클래스 안에서 공통적으로 사용하는 값을 저장하기 위한 변수
								// 클래스 변수는 프로그램 시작하면 만들어짐
	
	
	
	public Student2() {
		
	}
	
	
	// 매개변수가 있는 생성자
	public Student2(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2.0;
	}
	
	
	
	public String toString() {
		return name + " "+ kor + " " + eng + " " + avg + " "+ teacher;
	}
	
	
	// 생성자
	

}