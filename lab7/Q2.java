// Aim of the program-  Write a Java program to handle an ArithmeticException using try, catch, and finally block.
// Input: Operand values for division operation mentioned in the program
// Output: ArithmeticException caught by try-catch-finally block

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try {
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("The result of division is " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}