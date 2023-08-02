package algoPrj.day12.다형성예제;

public class Polymorphin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person[] persons = new Person[15];
		
		
		persons[0] = new Dance_NJ();
		persons[1] = new Dance();
		persons[2] = new DunDun();
		persons[3] = new JHDance();
		persons[4] = new juntae();
		persons[5] = new Kimhs();
		persons[6] = new KJY();
		persons[7] = new LY_dance();
		persons[8] = new Person();
		persons[9] = new PersonDance();
		persons[10] = new PersonMin();
		persons[11] = new Samba();
		persons[12] = new Singer();
		persons[13] = new Yejin();
		persons[14] = new 병진();
		
		
		System.out.println("우리 학생들이 춤을 추기 시작합니다");
		
		for(int i=0; i<persons.length; i++) {
			persons[i].dance();
		}
		
		
		
		

	}

}
