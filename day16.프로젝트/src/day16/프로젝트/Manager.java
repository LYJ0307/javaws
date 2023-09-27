package day16.프로젝트;

import java.io.Serializable;

public class Manager implements Serializable {
	
	String id, pw, pn, name;
	int date;
	
	
	
	public Manager() {}
	

		public Manager(String id, String pw, String pn, String name, int date) {
			this.id = id;
			this.pw = pw;
			this.pn = pn;
			this.name = name;
			this.date = date;
			
		}
		
		
		public String getId() {return id;}
		public String getPw() {return pw;}
		public String getName() {return name;}
		public int getDate() {return date;}
		
		
		public void setId(String id) {this.id = id;}
		public void setPw(String pw) {this.pw = pw;}
		public void setName(String name) {this.name = name;}
		public void setDate(int date) {this.date = date;}
		
		
		
		@Override
		public String toString() {
			return "[아이디 = " + id + ", 패스워드: " + pw + ", 이름: " + name + ", 예약날짜: " + date + "]";
		}
		
		
		
	}


