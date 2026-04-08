package model;

public class Event {
    private int id;
    private String title;
    private String city;

    public Event() {}

    public Event(int id, String title, String city) {
        this.id = id;
        this.title = title;
        this.city = city;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}