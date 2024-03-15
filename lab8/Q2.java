// How to swap two Strings without using a third variable ?

public class Q2 {
    public static void main(String args[]) {
        String first = "Hello";
        String second = "World";
        System.out.println("Before swapping: first = " + first + ", second = " + second);
        first = first + second;
        second = first.substring(0, first.length() - second.length());
        first = first.substring(second.length());
        System.out.println("After swapping: first = " + first + ", second = " + second);
    }
}