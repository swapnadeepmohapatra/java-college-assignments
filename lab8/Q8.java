// How to print duplicate characters from the string?

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.println("Duplicate character: " + input.charAt(i));
                    break;
                }
            }
        }
        sc.close();
    }
}