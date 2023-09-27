
public class Score {
	
	String name;
	int kor;
	int eng;
	char grade;
	int sum = 0;
	double avg = 0;
	
	
	public void calcGrade(String name, int kor, int eng, char grade) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		sum = kor + eng;
		avg = sum / 2.0;
		
		
		
		if ( avg >= 90 ) {
			this.grade = 'A';
		} else if (avg >= 80) {
			this.grade = 'B';
		} else if (avg >= 70) {
			this.grade = 'C';
		} else {
			this.grade = 'F';
		}
		
		
	}
	
	@Override
	public String toString() {
		return name + " " + kor + " " + eng + " " + grade;
	}

}
