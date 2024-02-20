// Write a program to create a class named Vehicle having protected instance variables
// regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
// vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
// individual private instance variables routeNumber in Bus and manufacturerName in Car
// and both of them having showData ( ) method showing all details of Bus and Car
// respectively with content of the super class’s showData ( ) method.

class Vehicle {
    String regnNumber, color, ownerName;
    int speed;

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    String routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Regn Number: " + regnNumber + "\nSpeed: " + speed + "\nColor: " + color + "\nOwner Name: "
                + ownerName + "\nRoute Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Regn Number: " + regnNumber + "\nSpeed: " + speed + "\nColor: " + color + "\nOwner Name: "
                + ownerName + "\nManufacturer Name: " + manufacturerName);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Bus bus = new Bus("123", 60, "Red", "John", "A1");
        Car car = new Car("456", 80, "Blue", "Jane", "Toyota");

        bus.showData();
        car.showData();
    }
}
