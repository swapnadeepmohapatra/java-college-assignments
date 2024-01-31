// Accept 10 numbers from command line and check how many of them are even and how many are odd.
// Input: Enter 10 number from keyboard
// Output:  Display number of even and odd number

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
