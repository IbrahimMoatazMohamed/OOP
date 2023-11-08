package Week6.Birdwatchers;

import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/Birdwatchers";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private Connection connection = null;


    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void getBirdByName(String birdName) throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM Birdwatchers WHERE bird_name = ?");
        statement.setString(1, birdName);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString("bird_name"));
            System.out.print(" (");
            System.out.print(rs.getString("Latin_name"));
            System.out.print("): ");
            System.out.print(rs.getString("Observation"));
            System.out.println(" observations");
        }
    }
    public void increaseObservation(String birdName) {
        try {
            String sql = "UPDATE Birdwatchers SET Observation = Observation + 1 WHERE bird_name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, birdName);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated == 0) {
                System.out.println("Is not a bird!");
            }
        } catch (SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void addData(String birdName, String latinName) {
        try {
            String sql = "INSERT INTO Birdwatchers (bird_name, Latin_name) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, birdName);
            statement.setString(2, latinName);
            int rowsInserted = statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void getAll() throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM Birdwatchers");
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString("bird_name"));
            System.out.print(" (");
            System.out.print(rs.getString("Latin_name"));
            System.out.print("): ");
            System.out.print(rs.getString("Observation"));
            System.out.println(" observations");
        }
    }
}