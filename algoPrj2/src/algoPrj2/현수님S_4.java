package algoPrj2;

import java.util.Scanner;

public class 현수님S_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//입력자료
		String name;
		int kor, eng, math;
		
		
		
		// 출력자료
		double avg;
		double avg_kor, avg_eng, avg_math;
		
		int n=1; //반복 제어 변수
		
		int sum_kor=0, sum_eng=0, sum_math=0;
		
		
		final int MAX = 2; // 상수화변수
		
		
		Scanner scan = new Scanner(System.in);
		
		
		while( n <= MAX) {
			//입력
			
			name = scan.next();
			kor = scan.nextInt();
			eng = scan.nextInt();
			math = scan.nextInt();
			
			
			sum_kor = sum_kor + kor;
			sum_eng = sum_eng + eng;
			sum_math = sum_math = math;
			
			
			avg = (kor+eng+math) / 3.0;
			
			
			if(avg >= 90) {
				System.out.println("excellent");
			}else if(avg < 60) {
				System.out.println("Fail");
			}
			System.out.println("이름: " + name + " \n국어:" + kor + " \n영어:" + eng + " \n수학: " + math + " ");
			
			
			n = n+1;
			
		}

		
		// 과목별 평균 구하기
		
		
		avg_kor = (double)sum_kor/MAX;
		avg_eng = (double)sum_eng/MAX;
		avg_math = (double)sum_math/MAX;
		
		
		System.out.println("국어 평균: " + avg_kor);
		System.out.println("영어 평균: " + avg_eng);
		System.out.println("수학 평균: " + avg_math);

		
		
	}
	

}
