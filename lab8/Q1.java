// Read two String user input and check if first contains second.

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        if (first.contains(second)) {
            System.out.println("First contains second");
        } else {
            System.out.println("First does not contain second");
        }

        sc.close();
    }
}