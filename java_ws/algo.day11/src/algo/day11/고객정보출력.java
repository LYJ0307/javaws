package algo.day11;

public class 고객정보출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		고객정보 cu = new 고객정보();
		cu.input("제임스", 40, true, 3);
		cu.printInfo();
		
		
		cu.input("이윤정", 25, false, 0);
		cu.printInfo();

	}

}
