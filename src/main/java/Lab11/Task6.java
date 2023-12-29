package Lab11;

import java.util.List;

interface CoffeeBuilder{
    public void buildType();
    public void buildSize();
    public void buildToppings();
    public Coffee build();
}

class Coffee {
    private String type, size;
    private List<String> toppings;

    private Coffee(EspressoBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }
    private Coffee(LatteBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }
    private Coffee(CappuccinoBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public static class EspressoBuilder implements CoffeeBuilder{
        private String type, size;
        private List<String> toppings;

        public void setType(String type) {
            this.type = type;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setToppings(List<String> toppings) {
            this.toppings = toppings;
        }
        public Coffee build(){
            return new Coffee(this);
        }
        @Override
        public void buildType(){}
        @Override
        public void buildSize(){}
        @Override
        public void buildToppings(){}
    }
    public static class LatteBuilder implements CoffeeBuilder{
        private String type, size;
        private List<String> toppings;

        public void setType(String type) {
            this.type = type;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setToppings(List<String> toppings) {
            this.toppings = toppings;
        }
        public Coffee build(){
            return new Coffee(this);
        }
        @Override
        public void buildType(){}
        @Override
        public void buildSize(){}
        @Override
        public void buildToppings(){}
    }
    public static class CappuccinoBuilder implements CoffeeBuilder{
        private String type, size;
        private List<String> toppings;

        public void setType(String type) {
            this.type = type;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setToppings(List<String> toppings) {
            this.toppings = toppings;
        }
        public Coffee build(){
            return new Coffee(this);
        }

        @Override
        public void buildType(){}
        @Override
        public void buildSize(){}
        @Override
        public void buildToppings(){}
    }
}

class CoffeeDirector{
    public Coffee constructCoffee(CoffeeBuilder builder){
        return builder.build();
    }
}

class Main5{
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector();
        Coffee cappuccinoBuilder = coffeeDirector.constructCoffee(new Coffee.CappuccinoBuilder());
        Coffee EspressoBuilder = coffeeDirector.constructCoffee(new Coffee.EspressoBuilder());
        Coffee LatteBuilder = coffeeDirector.constructCoffee(new Coffee.LatteBuilder());
    }
}