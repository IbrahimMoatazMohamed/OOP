package Week8.Task3;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Random;
import java.sql.Timestamp;
import java.util.concurrent.ThreadLocalRandom;

public class Events {

    public static Timestamp randomTimestamp() {
        long startTime = Timestamp.valueOf("2023-01-01 00:00:00").getTime();
        long endTime = Timestamp.valueOf("2024-12-31 23:59:59").getTime();

        long randomTime = ThreadLocalRandom.current().nextLong(startTime, endTime + 1);

        return new Timestamp(randomTime);
    }
    public static void generateEventsFile(String fileName, int numberOfRecords) throws IOException{
        Random random = new Random();
        numberOfRecords = 1000000;
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String[] types = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        for(int i = 0; i < numberOfRecords;i++){
            int userID = random.nextInt(0, 1000);
            String randomType = types[random.nextInt(0, types.length)];
            Timestamp randomTimestamp = randomTimestamp();

            writer.write(
                    Integer.toString(i + 1)
                            .concat(". " + randomTimestamp)
                            .concat(" " + randomType) + " " + userID + '\n'
            );
        }
        writer.close();
    }
    public static void readEventsFile(String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        for (int i = 0; i < 5; i++){
            System.out.println(reader.readLine());
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        generateEventsFile("events.txt", 5);
        readEventsFile("events.txt");
    }
}
