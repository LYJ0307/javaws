package day6;

public class Array2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//내가 좋아하는 과일	5개
		//내가 좋아하는 음료	5개
		
		String[] fruits = {"체리", "망고", "복숭아", "딸기", "수박"};
		String[] beverage = {"아메리카노", "흑임자라떼", "딸기라떼", "돌차라떼", "레몬티"};
		
		
		//2차원 배열
		
		//2차원 배열 선언
		
		
								// 행과 열
		
		//String[][] favorites = new String[2][5];
		
		
		String[][] favorites = { {"체리", "망고", "복숭아", "딸기", "수박"}, 
								{	"아메리카노", "흑임자라떼", "딸기라떼", "돌차라떼", "레몬티" }};
		
		
		
		System.out.println( favorites[0][0] ); // 체리
		System.out.println( favorites[0][1] ); // 망고
		System.out.println( favorites[0][2] ); // 복숭아
		System.out.println( favorites[0][3] ); // 딸기
		System.out.println( favorites[0][4] ); // 수박
		
		
		System.out.println( favorites[1][0] ); // 아메리카노
		System.out.println( favorites[1][1] ); // 흑임자라떼
		System.out.println( favorites[1][2] ); // 딸기라떼
		System.out.println( favorites[1][3] ); // 돌차라떼
		System.out.println( favorites[1][4] ); // 레몬티
		
		
		
		
		System.out.println("");
		
		
		
		String[][] grade = { {"1학년", "2학년", "3학년", "4학년", "5학년"}, {"1반", "2반", "3반", "4반", "5반"} };
		
		
		System.out.println( grade[0][0] );
		System.out.println( grade[0][1] );
		System.out.println( grade[0][2] );
		System.out.println( grade[0][3] );
		System.out.println( grade[0][4] );
		
		
		System.out.println( grade[1][0] );
		System.out.println( grade[1][1] );
		System.out.println( grade[1][2] );
		System.out.println( grade[1][3] );
		System.out.println( grade[1][4] );
		
		
		
		for(int i=0; i<grade.length; i++) {
			// 행
			for (int j=0; j<grade[i].length; j++) {
				// 열
				System.out.println(grade[i][j]);
			}
		}

		
		
		

	}

}
