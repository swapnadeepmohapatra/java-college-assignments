// Aim of the program - Define two packages as – General and Marketing. In General package define a class ‘employee’  with data members as empid(protected), ename(private) and a public method as earnings() which calculate total earnings as  
// earnings         basic + DA (80% of basic) + HRA (15% of basic)
// In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and has a method  tallowance() which calculates Travelling Allowance as 5% of total earning. Write the programs to find out total earning of a sales person for the given basic salary amount and print along with the emp id.
// Input:   Enter the employee id and emploee name 123   Amit
// Enter the basic salary 1000
// Output: The emp id of the employee is 123
// The total earning is 1950.0

package General;

public class General {
    protected int empId;
    private String eName;

    public void earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;

        System.out.println("The emp id of the employee is " + empId);
        System.out.println("The total earning is " + (basic + da + hra));
    }
}