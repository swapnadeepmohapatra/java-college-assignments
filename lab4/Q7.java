
// Write a program in
// java to input the details of a student having roll, name, full_mark and
// secured_mark as data members using constructor, then calculate the CGPA
// and display the details of student with CGPA.
import java.util.Scanner;

class Student {
    int roll;
    String name;
    float full_mark;
    float secured_mark;
    float cpga;

    Student(int r, String n, float f, float s) {
        roll = r;
        name = n;
        full_mark = f;
        secured_mark = s;
        cpga = s / f;
    }

    void display() {
        System.out.println("The CGPA of " + name + " is " + cpga);
    }
}

public class Q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the Student: ");
        String name = sc.nextLine();

        System.out.println("Enter roll number of the Student: ");
        int roll = sc.nextInt();

        System.out.println("Enter full marks of the Student: ");
        float full_mark = sc.nextFloat();

        System.out.println("Enter secured marks of the Student: ");
        float secured_mark = sc.nextFloat();

        Student s1 = new Student(roll, name, full_mark, secured_mark);
        s1.display();

        sc.close();
    }
}
