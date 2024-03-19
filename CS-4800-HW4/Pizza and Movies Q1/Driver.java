public class Driver {
    public static void main(String[] args) {

        System.out.println("- Part 1 -");

        final String pizzaHut = "Pizza Hut";

        Pizza smallPizza = new Pizza.Builder(pizzaHut, Pizza.Size.Small)
                .addBeef()
                .addChicken()
                .addHamAndPineapple()
                .build();

        Pizza mediumPizza = new Pizza.Builder(pizzaHut, Pizza.Size.Medium)
                .addExtraCheese()
                .addOlives()
                .addPepperoni()
                .addPesto()
                .addSausage()
                .addSpinach()
                .build();

        Pizza largePizza = new Pizza.Builder(pizzaHut, Pizza.Size.Large)
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

        smallPizza.displayDetails();
        mediumPizza.displayDetails();
        largePizza.displayDetails();


        System.out.println("- Part 2 -");

        displayPizzaHutExamples(pizzaHut);
        displayLittleCaesarsExamples();
        displayDominosExamples();
    }

    private static void displayPizzaHutExamples(String pizzaHut) {
        System.out.println("--- Pizza Hut: ");
        Pizza largePizzaHut = new Pizza.Builder(pizzaHut, Pizza.Size.Large)
                .addSpinach()
                .addBacon()
                .addPeppers()
                .build();

        largePizzaHut.displayDetails();

        Pizza smallPizzaHut = new Pizza.Builder(pizzaHut, Pizza.Size.Small)
                .addPeppers()
                .addHam()
                .build();

        smallPizzaHut.displayDetails();
    }

    private static void displayLittleCaesarsExamples() {
        final String littleCa
