package Lab9;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        Optional<Student> student = studentSystem.getStudentById(10);
        try{
            if(student.isEmpty()){
                throw new StudentNotFoundException("There is no student with this ID");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(student.get());

        System.out.println(studentSystem.getHighestGPAStudent());

        System.out.println(studentSystem.getLongestNameStudent());
    }
}
