package Week3;

import java.sql.SQLException;

public class Testdb {
    public static void main(String[] args) throws SQLException {
        DbConnect db = new DbConnect();
        db.getAllTasks();
    }
}
