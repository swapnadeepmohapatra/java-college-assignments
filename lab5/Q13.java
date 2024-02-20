// Write a Java program which creates a base class Num and contains an integer number
// along with a method shownum() which displays the number. Now create a derived class
// OctNum which inherits Num and overrides shownum() which displays the octal value of
// the number. Demonstrate the working of the classes.

class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    public void showNum() {
        System.out.println("Number: " + number);
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Q13 {
    public static void main(String[] args) {
        OctNum octNum = new OctNum(10);
        octNum.showNum();
    }
}
