package Com.event.model;

public class Main {
    public static void main(String[] args) {

        // User object
        User user = new User(1, "Mahek");
        user.displayRole();
        user.showDetails();

        System.out.println("------------------");

        // Admin object
        Admin admin = new Admin(2, "Aayushi");
        admin.displayRole();
        admin.showDetails();

        System.out.println("------------------");

        // Event object
        Event event = new Event("Concert", "12 Sept", "Mumbai", 999.0);
        event.showEvent();
    }
}