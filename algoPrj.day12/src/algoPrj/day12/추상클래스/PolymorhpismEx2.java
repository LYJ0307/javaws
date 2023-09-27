package algoPrj.day12.추상클래스;


public class PolymorhpismEx2 {

	public static void main(String[] args) {
		
		Person2[] persons = new Person2[14];
		persons[0] = new dan2dan();
		persons[1] = new Dance_JH2();
		persons[2] = new Dance_NJ2();
		persons[3] = new DunDun2();
		persons[4] = new dy();
		persons[5] = new JHDance2();
		persons[6] = new Juntae2();
		persons[7] = new Kimhs2();
		persons[8] = new Kjy2();
		persons[9] = new Kmj();
		persons[10] = new LY_dance2();
		persons[11] = new Samba2();
		persons[12] = new Yejin2();
		persons[13] = new 병진2();
		
		
		System.out.println("우리 학생들이 춤을 추기 시작합니다.");
		for(int i=0; i<persons.length; i++) {
			persons[i].dance(); 
		}
		
		
		
		

	}

}
