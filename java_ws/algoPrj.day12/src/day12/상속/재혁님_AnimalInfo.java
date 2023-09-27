package day12.상속;

public class 재혁님_AnimalInfo extends 재혁님_Animal {

	int age;

	public 재혁님_AnimalInfo(String name, String fname, int age) {
		
		super(name , fname);	//명시적으로 부모의 매개변수 있는 생성자 call
		this.age = age;

	}

	public String toString() {
		return "이름:"+ name +" 별명:"+  fname + " 나이:" + age;
	}

}
