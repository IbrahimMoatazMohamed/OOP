package Week4.firstTask;

public class Person {
    private String street;
    private String name;
    private String contry;
    private int age;
    public Person(String street, String name, String contry, int age) {
        this.street = street;
        this.name = name;
        this.contry = contry;
        this.age = age;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContry() {
        return contry;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return this.name
                .concat("\n ")
                .concat(street);
    }
}

