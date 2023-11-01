package Week5.Boxes;

import java.util.Objects;

public class Thing {
    private String name;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Thing(String name){
        this.name = name;
    }

    public Thing(String name, double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight must be non-negative");
        }
        this.name = name;
        this.weight = weight;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Thing)) {
            return false;
        }
        Thing other = (Thing) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
