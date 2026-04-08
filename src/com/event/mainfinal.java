package com.event.main;

import java.util.Scanner;

import com.event.model.Event;
import com.event.service.EventService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventService service = new EventService();

        while(true) {
            System.out.println("\n1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Delete Event");
            System.out.println("4. Update Event");
            System.out.println("5. Search Event");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String loc = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    // ✅ Using Object (OOP)
                    Event e = new Event(name, date, loc, price);
                    service.addEvent(e);
                    break;

                case 2:
                    service.viewEvents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    service.deleteEvent(id);
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    service.updateEvent(uid, newName);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    service.searchEvent(keyword);
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
