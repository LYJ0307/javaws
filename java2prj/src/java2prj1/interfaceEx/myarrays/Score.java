package java2prj1.interfaceEx.myarrays;

public class Score implements MyComparable<Score> {
	
	int kor;
	int eng;
	
	
	public Score(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
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





	@Override
	public int compareTo(Score other) {		
		return this.eng -other.eng;
	}





	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + "]";
	}
	
	
	
	 
	
	

}
