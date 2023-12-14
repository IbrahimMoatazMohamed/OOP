package Lab9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    ArrayList<Student> students = new ArrayList<>();


    StudentSystem(String fileName) {
        List<String> lines = new ArrayList<>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            lines = reader.lines().collect(Collectors.toList());
            reader.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        for(String line : lines){
            String[] student = line.split(",");
            students.add(
                    new Student(
                            (student[0] != null)? Integer.parseInt(student[0]) : 0,
                            (student[1] != null)? student[1] : "",
                            (student[2] != null)? student[2] : "",
                            (student[3] != null)? student[3] : "",
                            (student[4] == null)? 0.0F :Float.parseFloat(student[4])
                    )
            );
        }
        if(students.isEmpty())
            throw new EmptyStudentListException("List of students is empty.");
    }
    public int numberOfStudent(){
        return students.size();
    }
    public Optional<Student> getStudentById(int id){
        for(Student s: students){
            if(s.getID() == id){
                return Optional.of(s);
            }
        }
            return Optional.empty();
    }
    public Student getHighestGPAStudent(){
        Student result = students.get(0);
        for(Student s: students){
            if(result.getGPA() < s.getGPA()){
                result = s;
            }
        }
        if(!students.isEmpty()){
            return result;
        }
        throw new EmptyStudentListException("List of students is empty.");
    }

    public Student getLongestNameStudent(){
        Student result = students.get(0);
        for(Student s: students){
            if(result.getName().length() < s.getName().length()){
                result = s;
            }
        }
        if(students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty.");
        }
        return result;
    }
}
