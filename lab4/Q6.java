// Write a program in Java to define a
// class Rectangle having data member: length and breadth; to calculate the
// area and perimeter of the rectangle. Use constructor to read, and
// member functions to calculate and display.

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        this.breadth = 0;
        this.length = 0;
    }

    public Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public int area() {
        return length * breadth;
    }
}

public class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b = sc.nextInt();
        Rectangle r1 = new Rectangle(l, b);
        System.out.println("Area is: " + r1.area());

        sc.close();
    }
}
