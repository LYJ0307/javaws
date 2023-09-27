
public class Book {
	
	
	String bookCode;
	String bookTitle;
	String author;
	
	public Book() {
		
		
	}
	
	
	public Book(String bookCode, String bookTitle, String author) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
		
	}
	
	
	public String toString() {
		return "책 코드 : "+bookCode + " 책 제목: "+ bookTitle + " 저자: "+ author;
	
	}

}
