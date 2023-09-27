package java2prj1.generic.printer;


// 제너릭 클래스 만들기 , <> : 다이아몬드 연산자
// 제한된 제너릭 클래스 만들기
// Material 클래스를 상속한 클래스만 담을 수 있도록 제한함

public class GThreeDPrinter2<T extends Material> {
	
	
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
