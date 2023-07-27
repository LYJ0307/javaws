package algo.day8;

public class 짝수홀수만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int even[] = new int[5];
		int odd[] = new int[5];
		int even_num = 0, odd_num=0;

		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				even[even_num] = i;
				even_num++;
			}else {
				odd[odd_num] = i;
				odd_num++;
			}
		} //숫자 변수
		
		
		for(int i=0; i<even.length; i++) {	//
			System.out.println("짝수: "+even[i]);
		}	// index 변수
		
		for(int j=0; j<odd.length; j++) {
			System.out.println("홀수: "+odd[j]);
		}	// index 변수

	}

}
