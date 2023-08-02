


// 데이터 + 데이터를 다루는 기능을 하나의 단위로 묶는다.
// 데이터 보호 (접근 제어자: private, public , 생성자)


public class mile2 {

	
	// 멤버 변수
	private int mile;
	private double kiloMeter;

	
	// 멤버 변수를 다루는 기능(함수), 메서드라고 부름
	public double calCulator(int mile ) {
		this.mile = mile;
		return this.kiloMeter = mile*1.60934;
		
	}
	
	
	public double getKiloMeter() {
		return kiloMeter;
	}
	
	
}
