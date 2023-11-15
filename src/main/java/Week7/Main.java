package Week7;

public class Main {
    public static void main(String[] args){
        /* Logging
        ClassLogger man = new ClassLogger("Ibrahim");
        RecordLogger father = new RecordLogger("Moataz");
        Logger lambda = n -> System.out.println("Hallo to our world " + n);
        lambda.logMessage(man.getName());
        lambda.logMessage(father.name());
        */

        /* Library
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        libraryCatalog.addBook(new Book("Java Programming", "John Doe", 2021, true));
        libraryCatalog.addBook(new Book("Python Basics", "Jane Smith", 2020, false));
        libraryCatalog.addBook(new Book("Data Structures", "John Doe", 2019, true));

        libraryCatalog.displayCatalog();

        System.out.println("Is 'Java Programming' available? " + libraryCatalog.check("Java Programming"));


        String firstAvailableBook = libraryCatalog.retrieve("John Doe");
        System.out.println(firstAvailableBook);

        libraryCatalog.updateStatus(new Book("Python Basics", "Jane Smith", 2020, false));

        libraryCatalog.displayCatalog();
         */

        /*EmployeeManagementSystem
        EmployeeManagementSystem management = new EmployeeManagementSystem();
        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "John Doe", 500.0));
        employeeList.add(new Employee(2, "Jane Smith", 600.0));
        employeeList.add(new Employee(3, "Bob Johnson", 550.0));

        ArrayList<Employee> employeeMin = management.filterEmployeesBySalary(employeeList,502);
        management.displayEmployeeDetails(employeeMin);

        System.out.println(management.calculateTotalSalary(employeeList));

        management.displayEmployeeDetails(employeeMin);
         */

    }
}
