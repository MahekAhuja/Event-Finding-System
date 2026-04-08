package Com.event.model;

public class Admin extends AbstractUser {

    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}