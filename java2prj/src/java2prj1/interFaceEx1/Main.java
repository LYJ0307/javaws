package java2prj1.interFaceEx1;

public class Main {
    public static void main(String[] args) {
      
    	
    	Sing sing1 = new Sing();  	
    	
    	sing1.사랑아왜도망가();
    	sing1.노래부르기();
    	
    	
    	//당신이 듣고 싶은 음악은 ?
    	
    	String want ="발라드";  
    	if(want.equals("발라드")) {
	    	if ( sing1 instanceof 발라드) {
	    		sing1.사랑아왜도망가();
	    		
	    	}
    	}
    }
}