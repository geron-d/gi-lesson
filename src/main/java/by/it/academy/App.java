package by.it.academy;


public class App {
    static int a = 5;
    static int b = 8;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        printValue();

    }

    private static void printValue() {
        System.out.println(a + b);
        System.out.println(a * b + 1);
        System.out.println(a / b);
        
    }
}
