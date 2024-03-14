// Aim of the program -Define an interface with three methods – earnings(),
// deductions() and bonus() and define a Java class ‘Manager’ which uses this
// interface without implementing bonus() method. Also define another Java class
// ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.
// Write the complete program to find out earnings, deduction and bonus of a
// sbstaff with basic salary amount entered by the user as per the following
// guidelines –
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF 12% of basic
// bonus 50% of basic
// Input -Basic salary - 50000
// Output -Earnings - 97500
// Deduction -6000
// Bonus - 25000

import java.util.Scanner;

interface Employee {
    void earnings(double basic);

    void deductions(double basic);

    default void bonus(double basic) {
    };
}

class Manager implements Employee {
    double basic;
    double da;
    double hra;
    double pf;

    Manager(double basic) {
        this.basic = basic;
        da = (0.8 * basic);
        hra = (0.15 * basic);
        pf = (0.12 * basic);
    }

    public void earnings(double basic) {
        System.out.println("Earnings: " + (basic + da + hra));
    }

    public void deductions(double basic) {
        System.out.println("Deductions: " + pf);
    }
}

class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }

    public void bonus(double basic) {
        System.out.println("Bonus: " + (0.5 * basic));
    }
}

class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary of Manager: ");

        double basic = sc.nextDouble();

        Employee m = new Manager(basic);
        m.earnings(basic);
        m.deductions(basic);

        System.out.println();

        System.out.print("Enter basic salary of Substaff: ");

        basic = sc.nextDouble();

        Employee s = new Substaff(basic);
        s.earnings(basic);
        s.deductions(basic);
        s.bonus(basic);

        sc.close();
    }
}
