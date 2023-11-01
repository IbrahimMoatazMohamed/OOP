package Week5.Boxes;

import java.util.*;

public class MaxWeightBox extends Box{
    List<Thing> thingCollection = new ArrayList<>();
    private int maxWeight;
    private int weight;
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if(this.weight < maxWeight){
            this.weight += thing.getWeight();
            thingCollection.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing inBox : thingCollection){
            if(inBox.equals(thing)){
                return true;
            }
        }
        return false;
    }
}
