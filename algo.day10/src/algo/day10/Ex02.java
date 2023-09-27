package algo.day10;


import algo.day10.MG;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class 같은 폴더, 같은 패키지에서 찾음
		//import 사용해서 클래스의 패키지(폴더 정보)를 제공해야 함
		
		
		int[] result = MG.getYak(12);
		
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i] + " ");
		}

	}

}
