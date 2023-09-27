

public class Book출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book b1 = new Book("AA1001", "SpringMVC", "최작가");
		Book b2 = new Book("BB10001", "JSP/Sevlet 웹프로그래밍", "이작가");	
		Book b3 = new Book("CC1001", "MVC2모델", "박작가");
		
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		
		

	}

}
