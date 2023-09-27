package day6;

import java.util.Scanner;

public class 성적처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double avg;
		double kor_avg, eng_avg, math_avg;
		
		
		// 입력자료
		String name;
		int kor, eng, math;
		
		
		// 처리자료
		int sum;
		int kor_sum = 0, eng_sum = 0, math_sum = 0;
		
		
		//
		final int MAX = 5;
		final int SUBJECT = 3;
		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=MAX; i++) {
			name = scan.next();
			kor = scan.nextInt();
			eng = scan.nextInt();
			math = scan.nextInt();
			sum = kor+eng+math;
			avg = (double)sum/SUBJECT;// 나누기 정수의 연산, 실수 연산
			
			
			kor_sum += kor;
			eng_sum += eng;
			math_sum += math;
			
			
			if( avg >= 90 ) {
				System.out.println(name + " " + kor + " " + eng + " " + math + " " + avg + " Excellent");
			}else if(avg < 60) {
				System.out.println(name + " " + kor + " " + eng + " " + math + " "+ avg + "fail");
			} else {
				System.out.println(name + " " + kor + " " + eng + " " + math + " " + avg);
			}
			}
		
			//반복문 종료
			// 과목별 평균 구하기
			kor_avg = (double) kor_sum / MAX;
			eng_avg = (double) eng_sum  /  MAX;
			math_avg = (double) math_sum  /  MAX;
			
			
			System.out.println(kor_avg);
			System.out.println(eng_avg);
			System.out.println(math_avg);
			
		
		}

	}


