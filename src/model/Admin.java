package model;

<<<<<<< HEAD
public class Admin {

}
=======
public class Admin extends User {

    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Admin");
    }
}
>>>>>>> 2ede9760450ccbd4ae6aa6c760b8cb913b175a30
