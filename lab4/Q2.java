// Write a program in Java to accept 10 numbers from command line and check how many of them are even and how many odd.

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");

        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + "\nOdd: " + odd);

        sc.close();
    }
}
