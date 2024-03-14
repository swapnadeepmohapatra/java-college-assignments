// Aim of the Program: Write
// a program to create user defined exceptions called HrsException,
// MinException and SecException. Create a class Time which contains data
// members hours, minutes, seconds and a method to take a time from user
// which throws the user defined exceptions if hours (>24
// &<0),minutes(>60 &<0),seconds(>60 &<0).
// Input: Enter hours: 4
// Enter minutes: 54
// Enter seconds: 34
// Output: Correct Time-> 4:54:34

// Input: Enter hours: 30
// Enter minutes: 65
// Enter seconds: 65
// Output: Caught the exception
// Exception occurred: InvalidHourException:hour is not greater than 24
// Exception occurred: InvalidMinuteException:hour is not greater than 60
// Exception occurred: InvalidSecondException:hour is not greater than 60

import java.util.Scanner;

class InvalidHourException extends Exception {
    InvalidHourException(String e) {
        super(e);
    }
}

class InvalidMinuteException extends Exception {
    InvalidMinuteException(String e) {
        super(e);
    }
}

class InvalidSecondException extends Exception {
    InvalidSecondException(String e) {
        super(e);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String e) {
        super(e);
    }
}

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        int hr = sc.nextInt();
        System.out.println("Enter minutes");
        int min = sc.nextInt();
        System.out.println("Enter seconds");
        int sec = sc.nextInt();

        try {
            testHr(hr);
        } catch (InvalidHourException e) {
            System.out.println(e);
        }

        try {
            testMin(min);
        } catch (InvalidMinuteException e) {
            System.out.println(e);
        }

        try {
            testSec(sec);
        } catch (InvalidSecondException e) {
            System.out.println(e);
        }
    }

    static void testHr(int hr) throws InvalidHourException {
        if (hr > 24) {
            throw new InvalidHourException("hour is not greater than 24");
        }
    }

    static void testMin(int min) throws InvalidMinuteException {
        if (min > 60 || min < 0) {
            throw new InvalidMinuteException("minute can not be greater than 60");
        }
    }

    static void testSec(int sec) throws InvalidSecondException {
        if (sec > 60 || sec < 0) {
            throw new InvalidSecondException("second cant not be greater than 60");
        }
    }
}
