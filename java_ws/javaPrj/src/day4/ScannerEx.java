package day4;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("국어 성적을 입력하세요: ");
		int kor = sc.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		int eng = sc.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		int math = sc.nextInt();
		
		
		int sum = kor+eng+math;
		double avg = sum / 3.0;
		
		
		System.out.print("이름: "+name + " 국어: "+kor + " 영어: " + eng + " 수학: " + math + " 평균: " + avg);
	}

}
