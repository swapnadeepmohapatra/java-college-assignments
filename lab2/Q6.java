// Find the largest among 3 user entered nos. at the command prompt using Java
// Input: Enter three number .
// Output: Display the Largest Number

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }
}
