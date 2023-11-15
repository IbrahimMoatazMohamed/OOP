package Week7.Logging;

public record RecordLogger(String name) implements Logger {
    public void logMessage(String message){
        System.out.print(message.concat(" ").concat(name));
    }
}