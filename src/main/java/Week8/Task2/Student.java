<<<<<<< HEAD
package Week8.Task2;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Float> grades;

    public Student(String name, int id, List<Float> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Float> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrades(List<Float> grades) {
        this.grades = grades;
    }

     public String printInfo() {
        return "name= '" + name + '\'' +
                ", id=" + id +
                ", grades=" + grades ;
    }
}
=======
package Week8.Task2;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Float> grades;

    public Student(String name, int id, List<Float> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Float> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrades(List<Float> grades) {
        this.grades = grades;
    }

     public String printInfo() {
        return "name= '" + name + '\'' +
                ", id=" + id +
                ", grades=" + grades ;
    }
}
>>>>>>> ee7a3e2066b705edeaeb71e7cd683b7fb621652d
