package com.event;
import java.util.Scanner;
//Added by Aayushi for GitHub commit test

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventDAO dao = new EventDAO();

        while(true) {
            System.out.println("\n1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Delete Event");
            System.out.println("4. Update Event");
            System.out.println("5. Exit");

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

                    dao.addEvent(name, date, loc, price);
                    break;

                case 2:
                    dao.viewEvents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    dao.deleteEvent(id);
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    dao.updateEvent(uid, newName);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}