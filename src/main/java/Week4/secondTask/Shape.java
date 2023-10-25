package Week4.secondTask;

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }
    public String displayInfo(){
        return "The color is "
                .concat(this.color)
                .concat(", FillType is ")
                .concat(String.valueOf(this.filled));
    }
    public double getArea(){
        return 0;
    }
}
