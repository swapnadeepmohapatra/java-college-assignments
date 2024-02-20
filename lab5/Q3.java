// Write a Java program to show parameterized constructor.

public class Q3 {
    public Q3(int a) {
        System.out.println("Parameterized constructor with parameter: " + a);
    }

    public static void main(String[] args) {
        new Q3(1);
    }
}
