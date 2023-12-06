package PracticeForMidterm;

import java.sql.*;

public class dbConnection{
    private final static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/persons";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "1234";
    private Connection connection;
    public dbConnection() throws SQLException {
        connection = DriverManager.getConnection(CONNECTION_STRING,USERNAME,PASSWORD);
    }
    public void getAllPersons() throws SQLException{
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM person");
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.println(
                    rs.getString("id")
                            .concat("   ")
                            .concat(rs.getString("name"))
                            .concat("   ")
                            .concat(rs.getString("age"))
            );
        }
    }
    public void getByAge(int age) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM PERSON WHERE AGE = ?");
        statement.setInt(1, age);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.println(
                    rs.getString("id")
                            .concat("   ")
                            .concat(rs.getString("name"))
                            .concat("   ")
                            .concat(rs.getString("age"))
            );
        }
    }
}