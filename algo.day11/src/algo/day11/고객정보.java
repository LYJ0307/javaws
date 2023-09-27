package algo.day11;

public class 고객정보 {
	
	String name;
	int age;
	boolean isMarried;
	int child;
	
	
	
	public void input(String name, int age, boolean isMarried, int child) {
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
		this.child = child;
	}
	
	
	public void printInfo() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("결혼 여부: "+isMarried);
		System.out.println("아이: "+child+"명");
	}
	

}
