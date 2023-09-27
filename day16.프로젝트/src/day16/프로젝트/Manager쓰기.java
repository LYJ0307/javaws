package day16.프로젝트;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Manager쓰기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Manager m = new Manager("xorianm", "dldks0213", "010-5012-4570", "이윤정", 230806);
		Manager m1 = new Manager("khs220507", "220507", "010-7553-5128", "김현수", 230805);
		Manager m2 = new Manager("LJH982266", "739896", "010-9391-9516", "이정훈", 230808);
		
		
		ObjectOutputStream os = null;
		
		
		os = new ObjectOutputStream(new FileOutputStream("res/reservation.txt"));
		
		
		os.writeObject( m);
		os.writeObject( m1);
		os.writeObject( m2);
		
		
		

	}

}
