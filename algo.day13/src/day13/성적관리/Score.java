package day13.성적관리;

public class Score {
	
	
	//멤버변수
	private String name;
	private int kor;
	private int eng;
	private String result;
	
	
	
	//생성자
	//this : 참조형 변수, 자기참조형변수
	//단 static메서드에는 this가 전달되지 않는다
	
	public Score(String name, int kor, int eng) {	// that은 this 변수
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		
		CalResult();
		
	}
	
	
	
	public Score() {
		
	}
	
	
	
	public void CalResult() {
		int sum = kor + eng;
		double avg = sum / 2.0;
		if (avg >= 80) {
			result = "합격";
		} else {
			result = "불합격";
		}
	}



	// 오버라이드는 부모 클래스로부터 상속받은 매서드 재정의
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", result=" + result + "]";
	}
	
	
	// static 매서드는 클래스명.매서드()	Math.abs(-5)
	
	/*
	public static void print() {
		System.out.println("*******************");
		System.out.println( name);			//멤버변수(인스턴스 변수를 사용할 수 없다.)
	}
	*/
	
	
	//생성자
	
	
	
	//쎄터   set 첫글자 대문자 규칙
	//게터   get 첫글자 대문자 규칙
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public String getResult() {
		return result;
	}



	public void setResult(String result) {
		this.result = result;
	}



	public String getName() {
		return name;
	}
	
	
	
	

}
