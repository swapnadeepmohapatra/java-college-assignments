// Create a base class Distance which stores the distance between two locations in miles
// and a method travelTime(). The method prints the time taken to cover the distance when
// the speed is 60 miles per hour. Now in a derived class DistanceMKS, override
// travelTime() so that it prints the time assuming the distance is in kilometers and the
// speed is 100 km per second. Demonstrate the working of the classes.

class Distance {
    double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void travelTime() {
        System.out.println("Time taken to cover the distance: " + distance / 60 + " hours");
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double distance) {
        super(distance);
    }

    public void travelTime() {
        System.out.println("Time taken to cover the distance: " + distance / 100 + " seconds");
    }
}

public class Q15 {
    public static void main(String[] args) {
        Distance distance = new Distance(60);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(100);
        distanceMKS.travelTime();
    }
}
