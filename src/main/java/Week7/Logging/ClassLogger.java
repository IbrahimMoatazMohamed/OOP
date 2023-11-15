package Week7.Logging;

public class ClassLogger implements Logger{
    private String name;
    public ClassLogger(String n){
        name = n;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void logMessage(String message){
        System.out.print(message.concat(" ").concat(name));
    }
}
