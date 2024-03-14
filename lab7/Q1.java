// Aim of the program - Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
// Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
// Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try {
            int n;
            int[] arr = new int[4];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of numbers:");
            n = sc.nextInt();
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}