package day7함수;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(a(5));
		System.out.println(b('c'));
		System.out.println(c(4));
		System.out.println(d());
		System.out.println(e());
		
		System.out.println("더한 값은 " + (total(5,10)));
		
		System.out.println("더한 값은 " + (total(56,12)));
		
		System.out.println("1부터 10까지 더한 값은 "+total2());

	}
	
	
	public static int a(int a) {
		System.out.println();
		return 3;
	}
	
	
	//4를 주면 약속을 지킨 것
	public static int b(char a) {
		return 4;
	}
	
	
	public static char c(int a) {
		return 'c';
	}
	
	
	public static double d() {
		return 2.5;
	}
	
	
	public static String e() {
		return "안녕하세요";
	}
	
	
	public static int total(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	public static int total2() {
		
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		
		return sum;
		
	}

}
