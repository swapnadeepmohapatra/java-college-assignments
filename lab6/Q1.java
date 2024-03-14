// Aim of the program -Illustrate the usage of abstract class with following
// Java classes –
// An abstract class ‘student’ with two data members roll no, reg no, a method
// getinput() and an abstract method course()
// A subclass ‘kiitian’ with course() method implementation
// Write the driver class to print the all details of a kiitian object.

// Input - Rollno - 2205180
// Registration no - 1234567890
// Output -Rollno - 2205180
// Registration no - 1234567890
// Course - B.Tech. (Computer Science & Engg)

import java.util.Scanner;

abstract class Student {
    int rollNo;
    int regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll no: ");
        rollNo = sc.nextInt();
        System.out.print("Enter reg no: ");
        regNo = sc.nextInt();

        sc.close();
    }

    void printDetails() {
        System.out.println("Roll no: " + rollNo);
        System.out.println("Reg no: " + regNo);
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }
}

class Q1 {
    public static void main(String args[]) {
        Kiitian k = new Kiitian();
        k.getInput();
        k.printDetails();
        k.course();
    }
}