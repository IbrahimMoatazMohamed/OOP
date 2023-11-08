package Week6.Birdwatchers;
import java.sql.*;
import java.util.*;

public class Birdwatchers {
    public static void main(String[] args) throws SQLException {
        DbConnect db = new DbConnect();
        Scanner scanner = new Scanner(System.in);
        String entered = scanner.nextLine();
        while(!entered.equals("Quit")){
            if(entered.equals("Add")){
                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                db.addData(birdName, latinName);
            } else if (entered.equals("Observation")) {
                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                db.increaseObservation(birdName);
            } else if (entered.equals("Statistics")) {
                db.getAll();
            } else if (entered.equals("Show")) {
                System.out.print("What? ");
                String birdName = scanner.nextLine();
                db.getBirdByName(birdName);
            }
            entered = scanner.nextLine();
        }
    }
}
