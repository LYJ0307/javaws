package day16.프로젝트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager읽기 {

	public static void main(String[] args) throws FileNotFoundException, IOException,
	ClassNotFoundException{
		// TODO Auto-generated method stub
		
		
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream("res/reservation.txt"));
		
		ArrayList<Manager> list = new ArrayList<>();	
		
		Manager m = (Manager)ois.readObject();
		Manager m1 = (Manager)ois.readObject();
		Manager m2 = (Manager)ois.readObject();
		
		
		
		list.add(m);
		list.add(m1);
		list.add(m2);
		
		
		System.out.println("---- 예약 정보 ----\n");
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		
		
		
		Collections.sort(list,  new Comparator<Manager>() {		//객체 정렬 방법
			@Override
			public int compare(Manager o1, Manager o2) {
				 
				return o1.getDate()-o2.getDate();
			}});		
		
		
		System.out.println("\n---- 날짜별로 출력 ----\n");
		
	
		for( Manager  manager : list)
			System.out.println( manager);
		
		
		m.
		
		

	}

}
