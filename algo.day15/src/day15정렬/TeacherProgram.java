package day15정렬;

public class TeacherProgram {
	
	
	MyRunnable r;
	
	
	public void setR(MyRunnable r) {
		this.r = r;
	}
	
	
	public void run() {
		r.run();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();
		
		
		p.setR(new Test());
		p.run();
		
		
		p.setR( new MyRunnable() {
			@Override
			public void run() {
				System.out.println("윤정 코드 실행합니다");
			}
		});
		
		
		p.run();
		

	}

}
