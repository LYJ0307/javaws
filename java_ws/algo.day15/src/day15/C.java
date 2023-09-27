package day15;

public class C {
	
	public void 매서드(int su) throws OverNumberExcepton {
		
		//예외를 일으키는 코드, 발생시키는 코드
		if(su > 100) {
			throw new OverNumberExcepton();
		}
		//System.out.println("C 매서드");
		
	}
	

}
