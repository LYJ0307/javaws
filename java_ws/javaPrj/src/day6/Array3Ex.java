package day6;

public class Array3Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						// 3행 3열 총 기억 장소 9개
		int[][] even = new int[3][3];	// 짝수만 2  4  6
										// 짝수만 8  10  12
										//		14 16  18

		even[0][0] = 2;
		even[0][1] = 4;
		even[0][2] = 6;
		
		
		even[1][0] = 8;
		even[1][1] = 10;
		even[1][2] = 12;
		
		
		even[2][0] = 14;
		even[2][1] = 16;
		even[2][2] = 18;
		
		
		for (int i=0; i<even.length; i++) {
			for (int j = 0; j < even[i].length; j++) {
				System.out.print(even[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		
		
		int[][] odd = new int[3][3];
		
		
		odd[0][0] = 1;
		odd[0][1] = 3;
		odd[0][2] = 5;
		
		
		odd[1][0] = 7;
		odd[1][1] = 9;
		odd[1][2] = 11;
		
		
		odd[2][0] = 13;
		odd[2][1] = 15;
		odd[2][2] = 17;
		
		
		
		int v = 1;
		
		for (int i=0; i<odd.length; i++) {
			
			for (int j=0; j < odd[i].length; j++) {
				odd[i][j] = v;
				v += 2;
			}
			
			
		}
		
		
	}

}
