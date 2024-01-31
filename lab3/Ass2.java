// Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, calculate and display to read the values of length and breadth,  calculate the area and perimeter of the rectangle and display the result   respectively.
// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
// two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters for length and breadth is used to initialize length
// and breadth of the rectangle.
// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
// two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters for length and breadth is used to initialize length
// and breadth of the rectangle.
//     Input:   Mention length and breadth 
// Output: Display Area of Rectangle and Perimeter of rectangle.

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    int area;
    int perimeter;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter height:");
        breadth = sc.nextInt();
        sc.close();
    }

    public void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}

public class Ass2 {

}