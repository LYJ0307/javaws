package java2prj1.interFaceEx1;

public class Song {
	
	String name;
	
	
	public void 노래부르기() {
		System.out.println("노래 부르기");
	}
	
	@Override
	public String toString() {
		return "Song [name=" + name + "]";
	}
	
	
	public Song() {};
	
	
    public Song( String name){
        this.name = name;
}

}
