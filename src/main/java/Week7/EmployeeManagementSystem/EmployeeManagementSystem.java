package Week7.EmployeeManagementSystem;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public ArrayList<Employee> filterEmployeesBySalary(ArrayList<Employee> list, double min){
        ArrayList<Employee> result = new ArrayList<Employee>();
        for(Employee i : list){
            if(i.salary() > min){
                result.add(i);
            }
        }
        return result;
    }
    public double calculateTotalSalary(ArrayList<Employee> list){
        double sum = 0;
        for(Employee i : list){
            sum += i.salary();
        }
        return sum;
    }
    public void displayEmployeeDetails(ArrayList<Employee> list){
        for(Employee i : list){
            System.out.println(i);
        }
    }
}
