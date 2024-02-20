// In the earlier program, create a second derived class Office that inherits Building and
// stores the number of telephones and tables. Now demonstrate the working of all three
// classes.

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

class Office extends Building {
    int telephones, tables;

    public Office(int floors, int rooms, int footage, int telephones, int tables) {
        super(floors, rooms, footage);
        this.telephones = telephones;
        this.tables = tables;
    }

    public void showData() {
        super.showData();
        System.out.println("Telephones: " + telephones + "\nTables: " + tables);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Office office = new Office(3, 10, 5000, 5, 10);
        House house = new House(2, 5, 2000, 3, 2);

        office.showData();
        house.showData();
    }
}
