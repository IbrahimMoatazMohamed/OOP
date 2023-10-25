package Week4.secondTask;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return this.width * this.height;
    }
    @Override
    public String displayInfo(){
        return "The shape is rectangle "
                .concat(super.displayInfo())
                .concat("\n The width is : " + String.valueOf(this.width))
                .concat("\n The height is : " + String.valueOf(this.height))
                .concat("\n The area is : " + String.valueOf(getArea()));
    }

}
