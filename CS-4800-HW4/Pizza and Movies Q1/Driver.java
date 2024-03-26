public class Driver {
    public static void main(String[] args) {
        createAndEatPizza();
    }

    private static void createAndEatPizza() {
        System.out.println(" Pizza Selection: \n");

        Pizza smallPizza = new Pizza.Builder(Pizza.Size.Small)
                .addPizzaChain("Pizza Hut")
                .addBeef()
                .addChicken()
                .addHamAndPineapple()
                .build();

        Pizza mediumPizza = new Pizza.Builder(Pizza.Size.Medium)
                .addPizzaChain("Pizza Hut")
                .addExtraCheese()
                .addOlives()
                .addPepperoni()
                .addPesto()
                .addSausage()
                .addSpinach()
                .build();

        Pizza largePizza = new Pizza.Builder(Pizza.Size.Large)
                .addPizzaChain("Pizza Hut")
                .addTomatoAndBasil()
                .addMushroom()
                .addPeppers()
                .addOlives()
                .addSpicyPork()
                .addOnions()
                .addChicken()
                .addPepperoni()
                .addExtraCheese()
                .build();

        smallPizza.eat();
        mediumPizza.eat();
        largePizza.eat();

        // Repeat the structure for Part 2 with descriptive variables
    }
}
