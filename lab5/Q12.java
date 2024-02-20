// Write a Java program which creates a base class Num and contains an integer number
// along with a method shownum() which displays the number. Now create a derived class
// HexNum which inherits Num and overrides shownum() which displays the hexadecimal
// value of the number. Demonstrate the working of the classes.

class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    public void showNum() {
        System.out.println("Number: " + number);
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
    }
}

public class Q12 {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(10);
        hexNum.showNum();
    }
}
