// Write a Java program to show constructor overloading.

public class Q4 {
    public Q4() {
        System.out.println("0-arguments constructor");
    }

    public Q4(int a) {
        System.out.println("Parameterized constructor with parameter: " + a);
    }

    public static void main(String[] args) {
        new Q4();
        new Q4(1);
    }
}
