// Write a class, Commission, which has an instance variable, sales; an appropriate
// constructor; and a method, commission() that returns the commission.
// Now write a demo class to test the Commission class by reading a sale from the user,
// using it to create a Commission object after validating that the value is not negative.
// Finally, call the commission() method to get and print the commission. If the sales are
// negative, your demo should print the message “Invalid Input”

class Commission {
    private int sales;

    public Commission(int sales) {
        this.sales = sales;
    }

    public int commission() {
        if (sales < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        if (sales < 100) {
            return 0;
        } else if (sales < 200) {
            return sales * 5 / 100;
        } else if (sales < 300) {
            return sales * 10 / 100;
        } else {
            return sales * 15 / 100;
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Commission commission = new Commission(100);
        System.out.println(commission.commission());
    }
}
