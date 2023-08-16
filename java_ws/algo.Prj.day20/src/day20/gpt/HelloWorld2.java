package day20.gpt;

public class HelloWorld2 {
    private String message;

    public HelloWorld2(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloWorld2 helloWorld = new HelloWorld2("Hello, Java!");
        helloWorld.printMessage();
    }
}




