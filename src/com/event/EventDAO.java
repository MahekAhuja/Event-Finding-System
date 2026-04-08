package com.event;
import java.sql.*;

public class EventDAO {

    public void addEvent(String name, String date, String location, double price) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO events(name,date,location,price) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, date);
            ps.setString(3, location);
            ps.setDouble(4, price);

            ps.executeUpdate();
            System.out.println("Event Added");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void viewEvents() {
        try {
            Connection con = DBConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM events");

            while(rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("date") + " " +
                    rs.getString("location") + " " +
                    rs.getDouble("price")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteEvent(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "DELETE FROM events WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Event Deleted");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void updateEvent(int id, String name) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE events SET name=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Event Updated");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}