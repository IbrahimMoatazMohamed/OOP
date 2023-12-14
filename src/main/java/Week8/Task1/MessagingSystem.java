<<<<<<< HEAD
package Week8.Task1;

public class MessagingSystem {

    @CanSendMessage
    @RequiresPermission(PermissionLevel.ADMIN)
    public static void sendMessage(Object admin, String message){
        if (admin instanceof Admin admin1) {
            System.out.println("Admin " + admin1.getUsername() + " sent a message: " + message);
        } else {
            System.out.println("The user is restricted");
        }
    }

    public static void main(String[] args) {
        User user = new User("John");
        Admin admin = new Admin("Admin1");

        sendMessage(admin, "Hello, everyone!");
        sendMessage(user, "Hello, everyone!");
    }

}
=======
package Week8.Task1;

public class MessagingSystem {

    @CanSendMessage
    @RequiresPermission(PermissionLevel.ADMIN)
    public static void sendMessage(Object admin, String message){
        if (admin instanceof Admin admin1) {
            System.out.println("Admin " + admin1.getUsername() + " sent a message: " + message);
        } else {
            System.out.println("The user is restricted");
        }
    }

    public static void main(String[] args) {
        User user = new User("John");
        Admin admin = new Admin("Admin1");

        sendMessage(admin, "Hello, everyone!");
        sendMessage(user, "Hello, everyone!");
    }

}
>>>>>>> ee7a3e2066b705edeaeb71e7cd683b7fb621652d
