package java2prj1.generic.printer;


// 제너릭 클래스 만들기 , <> : 다이아몬드 연산자
public class GThreeDPrinter<T> {
	
	
	private T material;
	
	

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	public void print() {
		System.out.println( "3D print" + material);
	}
	
	
	
}
