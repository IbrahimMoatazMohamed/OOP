package Week4.secondTask;

import static java.lang.Math.pow;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 3.14 * pow(this.radius, 2);
    }
    @Override
    public String displayInfo(){
        return "The shape is circle "
                .concat(super.displayInfo())
                .concat(String.valueOf(radius))
                .concat("\n The area is : " + String.valueOf(getArea()));
    }
    public double calculateCircumference(double r, double PI){
        return 2 * PI * r;
    }
    public double calculateCircumference(double r){
        final double PI = 3.14;
        return 2 * 3.14 * r;
    }

}
