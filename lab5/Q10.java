// Create a base class Building that stores the number of floors of a building, number of
// rooms and its total footage. Create a derived class House that inherits Building and also
// stores the number of bedrooms and bathrooms. Demonstrate the working of the classes.

class Building {
    int floors, rooms, footage;

    public Building(int floors, int rooms, int footage) {
        this.floors = floors;
        this.rooms = rooms;
        this.footage = footage;
    }

    public void showData() {
        System.out.println("Floors: " + floors + "\nRooms: " + rooms + "\nFootage: " + footage);
    }
}

class House extends Building {
    int bedrooms, bathrooms;

    public House(int floors, int rooms, int footage, int bedrooms, int bathrooms) {
        super(floors, rooms, footage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public void showData() {
        super.showData();
        System.out.println("Bedrooms: " + bedrooms + "\nBathrooms: " + bathrooms);
    }
}

public class Q10 {
    public static void main(String[] args) {
        House house = new House(2, 5, 2000, 3, 2);
        house.showData();
    }
}
