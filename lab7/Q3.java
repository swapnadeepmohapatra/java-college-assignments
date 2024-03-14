// Aim of the program- Write
// a Java class which has a method called ProcessInput(). This method
// checks the number entered by the user. If the entered number is negative
// then throw an user defined exception called NegativeNumberException,
// otherwise it displays the double value of the entered number.
// Input: Enter a number 4
// Output: Double value: 8
// Input: Enter a number -4
// Output: Caught the exception
// Exception occurred: NegativeNumberException: number should be positive

import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException(String e) {
        super(e);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            ProcessInput(n);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }

    public static void ProcessInput(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (n * 2));
        }
    }
}