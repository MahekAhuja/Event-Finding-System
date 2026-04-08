package Com.event.model;

public abstract class AbstractUser {
    protected int id;
    protected String name;

    public AbstractUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayRole();

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
