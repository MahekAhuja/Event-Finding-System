package model;

public class User extends AbstractUser {

    public User(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("User");
    }
}