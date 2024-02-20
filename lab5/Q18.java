// 16. Aim of the program : Illustrate the execution of constructors in multi-level  inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.
// Input: Enter the dimensions
// Output: Display the dimensions accordingly

class Vehicle {
    int wheels;
    int speed;

    public Vehicle(int wheels, int speed) {
        this.wheels = wheels;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    int passengers;

    public Car(int wheels, int speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    public void display() {
        System.out.println("Car has " + wheels + " wheels and can carry " + passengers + " passengers");
    }
}

public class Q18 {
    public static void main(String[] args) {
        Car car = new Car(4, 60, 5);
        Truck truck = new Truck(6, 40, 1000);

        car.display();
        truck.display();

        if (car.speed > truck.speed) {
            System.out.println("Car is faster than truck");
        } else if (car.speed < truck.speed) {
            System.out.println("Truck is faster than car");
        } else {
            System.out.println("Car and truck have the same speed");
        }
    }
}
