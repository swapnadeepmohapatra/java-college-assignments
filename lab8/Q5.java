// How to remove all occurrences of a given character from input String

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = sc.next().charAt(0);
        System.out.println("After removing all occurrences of " + ch + " from " + input + ": "
                + input.replace(String.valueOf(ch), ""));
        sc.close();
    }
}