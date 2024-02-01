// Write a program in Java to create a class – Box with three data members
// (length, width, height) and a method volume (). Also implement the
// application class Demo where an object of the box class is created with
// user entered dimensions and volume is printed.

import java.util.Scanner;

class Box {
    int length;
    int width;
    int height;

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }
}

class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        Box box = new Box(length, width, height);

        System.out.println("Volume: " + box.volume());

        sc.close();
    }
}
