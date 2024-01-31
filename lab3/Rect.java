// Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth. Use default constructor to initialize the value of the data member to zero and parameterized constructor to initialize the value of data member according to the user input.
// Input: Mention the value of length and breadth
// Output: Display the area of rectangle accordingly.

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

public class Rect {
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
