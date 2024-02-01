// Write a program in Java to overload subtract method with various parameters in a class.

class Q4 {
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