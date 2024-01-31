// Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.
// Input:   Enter Roll No, Name and cgpa of ‘n’ number of students.
// Output: Display the details of ‘n’ number of students. Also display the name of student with lowest cgpa

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    public Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details for student " + (i + 1));
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter cgpa: ");
            float cgpa = sc.nextFloat();
            students[i] = new Student(roll, name, cgpa);
        }

        Student lowestCgpaStudent = students[0];
        for (int i = 0; i < n; i++) {
            System.out.println("The Details for student " + (i + 1) + "is: ");
            System.out.println("CGPA: " + students[i].cgpa);
            System.out.println("Name: " + students[i].name);
            System.out.println("Roll: " + students[i].roll);

            if (lowestCgpaStudent.cgpa > students[i].cgpa) {
                lowestCgpaStudent = students[i];
            }
        }

        System.out.println("Student with the lowest CGPA is " + lowestCgpaStudent.name);

        sc.close();
    }
}
