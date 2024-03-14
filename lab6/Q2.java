// Aim of the program -Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a Java class ‘Washing machine’ which implements this interface and write the code to check the value of the interface data member thru an object of the class.
// Input - mentioned in the program
// Output - Capacity of the motor is -----

interface Motor {
    int capacity = 100;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is Running.... Ghooommmm.....");
    }

    public void consume() {
        System.out.println("Motor is Consuming...... Suusshhh.....");
    }
}

class Q2 {
    public static void main(String args[]) {
        Motor wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}