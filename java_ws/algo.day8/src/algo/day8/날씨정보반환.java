package algo.day8;

import java.util.Scanner;

public class 날씨정보반환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weather[] = new String[3];
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
	
	
		for(int i=0; i<weather.length; i++) {
			System.out.print("날씨 정보 입력: ");
			String weath = sc.next();
			weather[cnt] = weath;
			cnt++;
			
		}
		
		for(int i=0; i<weather.length; i++) {
		System.out.println("날씨 정보 출력: " + weather[i]);
		}
	}

}
