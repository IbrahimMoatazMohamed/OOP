package Week5;

import Week5.Boxes.*;

public class Week5 {
    public static void main(String[] args) {
        Box coffeeBox = new MaxWeightBox(10);
        Box box1 = new OneThingBox();
        Box box = new BlackHoleBox();

        if (coffeeBox instanceof MaxWeightBox) {
            MaxWeightBox newCoffeeBox = (MaxWeightBox) coffeeBox;
            newCoffeeBox.add(new Thing("Saludo", 5));
            newCoffeeBox.add(new Thing("Pirkka", 5));
            newCoffeeBox.add(new Thing("Kopi Luwak", 5));
            System.out.println(newCoffeeBox.isInTheBox(new Thing("Saludo")));
            System.out.println(newCoffeeBox.isInTheBox(new Thing("Pirkka")));
            System.out.println(newCoffeeBox.isInTheBox(new Thing("Kopi Luwak")));
        }

        if (box1 instanceof OneThingBox) {
            OneThingBox newBox1 = (OneThingBox) box1;
            newBox1.add(new Thing("Saludo", 5));
            newBox1.add(new Thing("Pirkka", 5));
            System.out.println(newBox1.isInTheBox(new Thing("Saludo")));
            System.out.println(newBox1.isInTheBox(new Thing("Pirkka")));
        }

        if (box instanceof BlackHoleBox) {
            BlackHoleBox newBox = (BlackHoleBox) box;
            newBox.add(new Thing("Saludo", 5));
            newBox.add(new Thing("Pirkka", 5));
            System.out.println(newBox.isInTheBox(new Thing("Saludo")));
            System.out.println(newBox.isInTheBox(new Thing("Pirkka")));
        }
    }
}
