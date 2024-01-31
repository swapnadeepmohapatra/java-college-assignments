// Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object.
// Input:  Mention various subtract method having different parameters.
// Output: Subtract method will display the result accordingly

public class Sub {
    public static void main(String[] args) {
        System.out.println("3 - 2 = " + subtract(3, 2));
        System.out.println("3 - 2 - 1 = " + subtract(3, 2, 1));
        System.out.println("3.5 - 2.1 = " + subtract(3.5, 2.1));
        System.out.println("3.5 - 2.1 - 1.1 = " + subtract(3.5, 2.1, 1.1));
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double subtract(double a, double b, double c) {
        return a - b - c;
    }
}