// An educational institution maintains a database of its employees. The database is
// divided into a number of classes whose hierarchical relationships are shown below.
// Write all the classes and define the methods to create the database and retrieve
// individual information as and when needed.
// Write a driver program to test the classes.
// Staff (code, name) Teacher (subject, publication) is a Staff
// Officer (grade) is a Staff Typist (speed) is a Staff
// RegularTypist (remuneration) is a Typist CasualTypist (daily wages) is a Typist.

class Staff {
    int code;
    String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void showData() {
        System.out.println("Code: " + code + "\nName: " + name);
    }
}

class Teacher extends Staff {
    String subject, publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public void showData() {
        super.showData();
        System.out.println("Subject: " + subject + "\nPublication: " + publication);
    }
}

class Officer extends Staff {
    String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public void showData() {
        super.showData();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public void showData() {
        super.showData();
        System.out.println("Speed: " + speed);
    }
}

class CasualTypist extends Typist {
    int dailyWages;

    public CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public void showData() {
        super.showData();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

class RegularTypist extends CasualTypist {
    int remuneration;

    public RegularTypist(int code, String name, int speed, int dailyWages, int remuneration) {
        super(code, name, speed, dailyWages);
        this.remuneration = remuneration;
    }

    public void showData() {
        super.showData();
        System.out.println("Remuneration: " + remuneration);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Staff staff = new Staff(0, "John");
        Officer officer = new Officer(2, "Jane", "A");
        Teacher teacher = new Teacher(1, "John", "Math", "Maths for Dummies");
        Typist typist = new Typist(4, "Jill", 100);
        CasualTypist casualTypist = new CasualTypist(5, "Jack", 50, 500);
        RegularTypist regularTypist = new RegularTypist(3, "Jack", 60, 1000, 500);

        staff.showData();
        teacher.showData();
        officer.showData();
        typist.showData();
        casualTypist.showData();
        regularTypist.showData();
    }
}
