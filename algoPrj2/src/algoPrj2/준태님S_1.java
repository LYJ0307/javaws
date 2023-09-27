package algoPrj2;

public class 준태님S_1 {

	public static void main(String[] args) {	//START
		// TODO Auto-generated method stub
		
		
		//변수 선언
		double hp = 250; //h사 인구
		double hu = 0.036; //h사 인구 증가율
		double hup = 0; // h사 증가인구
		
		double kp = 180; //k사 인구
		double ku = 0.042; //k사 인구 증가율
		double kup = 0;
		
		
		int y = 1999; //기준연도
		int c = 0;
		int sum; //출력변수 (k시가 H시 인구를 초과하는 년도)
		
		
		while(kp <= hp) {
			
			
			hup = hp * hu;	// 
			hp = hp + hup;
			
			
			kup = kp * ku;
			kp = kp + kup;
			
			c = c+1;
			System.out.println("h시 " + hp);
			System.out.println("k시 " + kp);
			
		}
		
		sum = y + c;
		System.out.println("k시가 h시 인구를 초과하는 연도 "+sum+"년도");
		
		
		
		
		
		
	}// END

}
