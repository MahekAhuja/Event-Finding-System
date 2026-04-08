package Com.event.model;

public class Event {
    private String name;
    private String date;
    private String location;
    private double price;

    public Event(String name, String date, String location, double price) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public void showEvent() {
        System.out.println("Event: " + name + ", Date: " + date +
                ", Location: " + location + ", Price: " + price);
    }
}
