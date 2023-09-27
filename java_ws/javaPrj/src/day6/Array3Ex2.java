package day6;

public class Array3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] even = {
				{2, 4, 6},
				{8, 10, 12},
				{14, 16, 18}
		} ;
		
		
		int[][] odd = {
				{1, 3, 5},
				{7, 9, 11},
				{13, 15, 17}
		};
		
		
		
		// 면 행 렬
		int[][][] numbers = {
				{
					{2,4,6},
					{8,10,12},
					{14,16,18}
				},
				
				{
					{1,3,5},
					{7,9,11},
					{13,15,17}
				},
				

		};
		
		
		
		
		String[][][] menu = {
			
				{
					{"빠삐코", "와", "스크류바"},
					{"보석바", "누가바", "수박바"},
					{"죠스바", "와일드바디", "돼지바"}
				}
				,
				
				{
					{"포카칩", "고구마깡", "새우깡"},
					{"칸쵸", "초코송이", "제크"},
					{"눈을감자", "바나나킥", "웨하스"}
				}
				
		};
		
		
		
		System.out.println(numbers[0][1][1]);
		System.out.println(numbers[1][2][1]);
		System.out.println(numbers[1][0][1]);
		System.out.println(numbers[1][2][1]);
		
		
		
		System.out.println(menu[0][1][1]);
		System.out.println(menu[1][1][1]);
		System.out.println(menu[1][2][0]);
		
		
		//	10	,	15 출력
		
		
		/*for (int i=0; i<even.length; i++) {
			for (int j=0; j<even[i].length; j++) {
				//
				
				System.out.print( even[i][j] + " " );
				
			}
			
			System.out.println();
			
		}*/
		
		
		//홀수배열
		/*for (int i=0; i<odd.length; i++) {
			for(int j=0; j<odd[i].length; j++) {
				System.out.print(odd[i][j] + " ");
			}
			
			System.out.println();
		}*/
		
		
		
		for(int i=0; i<menu.length; i++) {
			for (int j=0; j<menu[i].length; j++) {
				for (int m=0; m<menu[j].length; m++) {
					System.out.println(menu[i][j][m]+ "");
				}
				System.out.println("");
			}
		}
		
	}

}
