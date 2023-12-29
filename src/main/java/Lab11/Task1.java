package Lab11;

import java.util.Scanner;

class LogError extends RuntimeException{
    public LogError(String m){
        super(m);
    }
}

class Logger {
    private static Logger instance;

    private Logger(){

    }

    public static Logger getInstance() {
        synchronized (Logger.class){
            if (instance == null) {
                instance = new Logger();
            }
        }
        return instance;
    }
    public void log(String message){
        System.out.println(message);
    }
    public void logInfo(String message){
        System.out.println(message);
    }
    public void logWarning(String message){
        System.out.println("WARNING MESSAGE");
        System.out.println(message);
    }
    public void logError(String message){
        throw new LogError(message);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Logger user = Logger.getInstance();
        user.log("you must enter the email and password");
        int tries = 0;
        String password = "123";
        String enteredPassword = null;
        while(!password.equals(enteredPassword) && tries < 3){
            if(tries == 0){
                user.logInfo("Enter email: ");
                reader.nextLine();
                user.logInfo("Enter password: ");
                enteredPassword = reader.nextLine();
            } else {
                System.out.println();
                user.logWarning("you have: " + String.valueOf(2 - tries) + " tries");
                user.logInfo("Enter password");
                enteredPassword = reader.nextLine();
            }
            tries++;
        }
        if(password.equals(enteredPassword)){
            user.logInfo("you loged in");
        }else{
            user.logError("This is not your account");
        }
    }
}
