package algo.day9;

public class peopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People p = new People();	//실행시키려면 main에서 해야 하는데 메인이 없어서
		
		p.age= 40;
		p.child = "2명";
		p.isMarried = true;
		p.name = "james";
		
		
		System.out.println(p.age);
		System.out.println(p.child);
		System.out.println(p.isMarried);
		System.out.println(p.name);
		
	}

}
