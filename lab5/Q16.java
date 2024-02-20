// Create a base class called “vehicle” that stores number of wheels and speed.
// Create the following derived classes –
// “car” that inherits “vehicle” and also stores number of passengers.
// “truck” that inherits “vehicle” and also stores the load limit.
// Write a main function to create objects of these two derived classes and display all
// the information about “car” and “truck”. Also compare the speed of these two
// vehicles - car and truck and display which one is faster

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

class Truck extends Vehicle {
    int loadLimit;

    public Truck(int wheels, int speed, int loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    public void display() {
        System.out.println("Truck has " + wheels + " wheels and can carry " + loadLimit + " kg of load");
    }
}

public class Q16 {
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
