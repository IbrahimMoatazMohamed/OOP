package Week5.SecondTask;

public class Box {
    private double weight;
    private double maximumCapacity;
    private int counter;
    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.weight = 0;
    }
    public void add(ToBeStored item){
        if(weight < maximumCapacity){
           this.counter++;
           this.weight = this.weight + item.weight();
        }else {
            System.out.println("Can't add more.");
        }
    }
    public String toString(){
        return "Box: "
                .concat(String.valueOf(this.counter))
                .concat(" things, total weight ")
                .concat(String.valueOf(this.weight))
                .concat(" kg");
    }
}
