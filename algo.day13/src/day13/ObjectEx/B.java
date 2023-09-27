package day13.ObjectEx;

public class B {
	
	int number;

	
	
	public B() {
		
	}
	
	
	public B(int number) {
		super();
		this.number = number;
		
	}
	
	
	
	@Override
	public String toString() {
		return number + "입니다";
	}
	
	
	//매개변수를 받으면서 업캐스팅
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		B b = (B)obj;	 //다운캐스팅
		
		if( this.number == b.number)
			result = true;
		
		return result;
	}
	
	
	
	

}
