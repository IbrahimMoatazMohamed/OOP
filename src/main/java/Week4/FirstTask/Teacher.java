package Week4.FirstTask;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String street, int salary){
        super(name, street);
        this.salary = salary;
    }
    @Override
    public String toString(){
        return super.toString()
                .concat("\n salary ")
                .concat(Integer.toString(this.salary))
                .concat(" euro/month");
    }
}
