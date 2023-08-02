package day11.inheritance.상속;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Cat a = new Cat();
		
		Dog b = new Dog();
		
		
		//print(a);
		//print(b);
		
		//printCat(a);
		//printDog(b);
		
		
		
	}

	

	public static void print (Animal animal) {
		animal.짖는다();
	}
	
	
	public static void printCat (Cat cat) {
		cat.짖는다();
	}
	
	
	public static void printDog (Dog dog) {
		dog.짖는다();
	}
	
}
