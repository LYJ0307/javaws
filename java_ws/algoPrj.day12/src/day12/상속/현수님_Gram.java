package day12.상속;

public class 현수님_Gram extends 현수님_Notebook {
	String name;
	String gpu;
	
	public 현수님_Gram(String cpu, int ram, String name, String gpu) {
		super(cpu, ram );		// 부모의 매개변수가 있는 생성자를 호출하는 코드
		this.cpu = cpu;			// 명시적으로 부모의 생성자를 호출하는 코드가 없으면
		this.ram = ram;			// 부모의 기본 생성자 super()를 호출한다. !!
		this.name = name;
		this.gpu = gpu;
	}
	
	public String toString() {
		return name + cpu + ram + gpu;
	}
}
