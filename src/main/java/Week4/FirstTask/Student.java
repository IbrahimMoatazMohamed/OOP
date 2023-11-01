package Week4.FirstTask;

public class Student extends Person {
    private int credits = 0;
    private int student_id;
    private double grades;
    public Student(String street, String name, String contry, int age, int student_id, double grades){
        super(street, name, contry, age);
        this.student_id = student_id;
        this.grades = grades;
    }
    public Student(String street, String name, String contry, int age, int credits, int student_id, double grades){
        super(street, name, contry, age);
        this.credits = credits;
        this.student_id = student_id;
        this.grades = grades;
    }
    public void study(){
        credits++;
    }
    public int credits(){
        return this.credits;
    }
    @Override
    public String toString(){
        return super.toString()
                .concat("\n ")
                .concat(Integer.toString(this.credits));
    }

    public int getStudent_id() {
        return student_id;
    }

    public double getGrades() {
        return grades;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void addGrade(double grades) {
        if(grades < 0) {
            System.out.println("Please enter the correct grades");
        }
        else{
            this.grades = grades;
        }

    }
}
