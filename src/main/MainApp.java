package main;

<<<<<<< HEAD
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Event Finder System Started...");
    }
}
=======
import model.*;

public class MainApp {
    public static void main(String[] args) {

        User user = new User(1, "Mahek");
        user.displayRole();
        user.showDetails();

        Admin admin = new Admin(2, "Aayushi");
        admin.displayRole();
        admin.showDetails();
    }
}
>>>>>>> ed8c3b0a27b2ad286d5edfff21dc575c778610fa
