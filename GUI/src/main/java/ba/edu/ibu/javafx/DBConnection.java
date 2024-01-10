package ba.edu.ibu.javafx;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/javafxml";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setValue(Student s) {
        try {
            PreparedStatement pst = connection.prepareStatement("UPDATE students SET name = ?, surname = ?, year = ?, cycle = ? WHERE ID = ?");

            pst.setString(1, s.getName());
            pst.setString(2, s.getSurname());
            pst.setString(3, s.getYear());
            pst.setString(4, s.getCycle());
            pst.setInt(5, s.getId());

            int rowsAffected = pst.executeUpdate();

            pst.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static ResultSet getAll(){
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM students");
            return pst.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void insertValue(Student s) {
        try {
            PreparedStatement pst = connection.prepareStatement("INSERT INTO students (ID, name, surname, year, cycle) VALUES (?, ?, ?, ?, ?)");

            pst.setInt(1, s.getId());
            pst.setString(2, s.getName());
            pst.setString(3, s.getSurname());
            pst.setString(4, s.getYear());
            pst.setString(5, s.getCycle());

            int rowsAffected = pst.executeUpdate();

            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static boolean isDublicate(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id FROM students WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean isEmail(String email, String password){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String strings(){
        String result = "";
        try {
            PreparedStatement pst = connection.prepareStatement("Select * from students");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                result += " " + rs.getString("name");
                result += " " + rs.getString("surname");
                result += " " + rs.getString("year");
                result += " " + rs.getString("cycle");
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return result;
        }
    }
}
