package Week5.Boxes;

public class OneThingBox extends Box {
    Thing one;
    public OneThingBox(){}

    @Override
    public void add(Thing thing) {
        if(one == null){
            this.one = thing;
        }
        return;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return thing.equals(this.one);
    }
}
