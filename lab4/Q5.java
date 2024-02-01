// Write a program in Java which will overload the area () method and
// display the area of a circle, triangle and square as per user choice and
// user entered dimensions.

public class Q5 {
    public static void main(String args[]) {
        System.out.println("Area of circle with radius 2.5 is: " + area(2.5));
        System.out.println("Area of square with side 5 is: " + area(5));
        System.out.println("Area of traingle with height 2.4 and breadth 5.6 is: " + area(2.4, 5.6));
    }

    public static double area(double r) {
        return 3.14 * r * r;
    }

    public static double area(double b, double h) {
        return 0.5 * b * h;
    }

    public static int area(int a) {
        return a * a;
    }
}
