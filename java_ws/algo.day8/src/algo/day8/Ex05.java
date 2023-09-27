package algo.day8;



public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result = getMoneyCount(2520);
		
		
		for(int moneyUnit : result ) { // 향상된 for문 (moneyunit 변수, result 배열)
			
			System.out.print(moneyUnit+ " ");
			
		}// 화폐 매수의 값을 이용하고 싶다면
		
		
		//화폐 매수의 값을 사용하고 싶다면 값을 받아와야 함
		
		
	}

	public static int[] getMoneyCount(int money) {
		int [] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneyArrMain = new int [8];
		
		
		for(int i = 0 ; i <moneyArr.length; i++ ) {
			moneyArrMain[i]= money / moneyArr[i];
			money %= moneyArr[i];
		}
		
        System.out.print("돈 매수 구하기: ");
        /*for(int i=0 ; i < moneyArrMain.length; i++) {
            System.out.print(moneyArrMain[i] + " ");
        }*/
        
		return moneyArrMain;
	}

}
