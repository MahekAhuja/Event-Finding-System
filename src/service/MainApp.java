package service;

import model.*;

import java.util.*;

public class MainApp {
    static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SMART EVENT BOOKING SYSTEM =====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Delete Event");
            System.out.println("4. Search Event");
            System.out.println("5. OOP Demo");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter seats: ");
                    int seats = sc.nextInt();

                    events.add(new Event(events.size()+1, name, location, date, seats));
                    System.out.println("Event Added!");
                    break;

                case 2:
                    if (events.isEmpty()) {
                        System.out.println("No events found.");
                    } else {
                        for (Event e : events) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    events.removeIf(e -> e.getId() == id);
                    System.out.println("Deleted!");
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();

                    for (Event e : events) {
                        if (e.getName().contains(keyword) || e.getLocation().contains(keyword)) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 5:
                    Person p1 = new User("Ruchita");
                    Person p2 = new Admin("Mahek");

                    p1.displayRole();
                    p2.displayRole();
                    break;

                case 6:
                    System.out.println("Exit");
                    return;
            }
        }
    }
}

// final update for contributors