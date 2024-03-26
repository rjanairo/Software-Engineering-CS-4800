import java.util.ArrayList;

public class Pizza {
    public enum Size {
        Large, Medium, Small
    }

    private ArrayList<String> toppings;
    private Size size;
    private String pizzaChain;

    private Pizza(Builder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        if (toppings.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(String.join(", ", toppings));
        }
        System.out.println();
    }

    public static class Builder {
        private String pizzaChain = "n/a";
        private Size size;
        private ArrayList<String> toppings = new ArrayList<>();

        public Builder(Size size) {
            this.size = size;
        }

        public Builder addPizzaChain(String pizzaChain) {
            this.pizzaChain = pizzaChain;
            return this;
        }

        public Builder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        public Builder addPepperoni() { return addTopping("Pepperoni"); }
        // ... Include all other topping methods here with the same structure

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
