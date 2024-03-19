package MoviesAndPizza;

import java.util.ArrayList;

public class Pizza {
    public enum Size {
        Large, Medium, Small
    }
    
    private final ArrayList<String> toppings;
    private final Size size;
    private final String pizzaChain;

    private Pizza(Builder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void displayDetails() {
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + (toppings.isEmpty() ? "None" : toppings));
        System.out.println();
    }

    public static class Builder {
        private final String pizzaChain;
        private final Size size;
        private final ArrayList<String> toppings = new ArrayList<>();

        public Builder(String pizzaChain, Size size) {
            this.pizzaChain = pizzaChain;
            this.size = size;
        }

        public Builder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        // Convenience methods for adding specific toppings
        public Builder addPepperoni() { return addTopping("Pepperoni"); }
        public Builder addSausage() { return addTopping("Sausage"); }
        public Builder addMushroom() { return addTopping("Mushroom"); }
        public Builder addBacon() { return addTopping("Bacon"); }
        public Builder addOnions() { return addTopping("Onions"); }
        public Builder addExtraCheese() { return addTopping("Extra Cheese"); }
        public Builder addPeppers() { return addTopping("Peppers"); }
        public Builder addChicken() { return addTopping("Chicken"); }
        public Builder addOlives() { return addTopping("Olives"); }
        public Builder addSpinach() { return addTopping("Spinach"); }
        public Builder addTomatoAndBasil() { return addTopping("Tomato and Basil"); }
        public Builder addBeef() { return addTopping("Beef"); }
        public Builder addHam() { return addTopping("Ham"); }
        public Builder addPesto() { return addTopping("Pesto"); }
        public Builder addSpicyPork() { return addTopping("Spicy Pork"); }
        public Builder addHamAndPineapple() { return addTopping("Ham and Pineapple"); }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
