package day14.ioEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/acorn.txt"));
			
			int sum = 0;
			double avg;
			int count = 0;
			
			
			while(true) {
				String data = bf.readLine();
				count++;
				if ( data == null)break;
				System.out.println( data);
				int dataNumber = Integer.parseInt(data);
				sum += dataNumber;	// sum = sum + dataNumber;
			}
			
			avg = sum / count;
			System.out.println( avg);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
