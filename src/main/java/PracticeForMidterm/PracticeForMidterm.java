package PracticeForMidterm;
import java.sql.*;

public class PracticeForMidterm {
    public static void main(String[] args) throws SQLException{
        dbConnection db = new dbConnection();
        db.getAllPersons();
        db.getByAge(31);
    }
}