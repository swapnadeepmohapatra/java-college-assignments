// Write a program in Java to find the largest among 3 user entered nos. through command line.

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }

        sc.close();
    }
}