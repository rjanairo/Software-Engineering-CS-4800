public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("John", DietType.NO_RESTRICTION),
                new Customer("Alice", DietType.PALEO),
                new Customer("Bob", DietType.VEGAN),
                new Customer("Emily", DietType.NO_RESTRICTION),
                new Customer("David", DietType.NUT_ALLERGY),
                new Customer("Sophia", DietType.VEGAN)
        };

        MacronutrientFactory mealFactory = MealFactory.getInstance();

        for (Customer customer : customers) {
            Carbs carbs = mealFactory.createCarbs(customer.getDietType());
            Protein proteins = mealFactory.createProtein(customer.getDietType());
            Fats fats = mealFactory.createFats(customer.getDietType());

            System.out.println(customer.getName() + "'s Meal:");
            System.out.println("Carbs: " + carbs.getName());
            System.out.println("Proteins: " + proteins.getName());
            System.out.println("Fats: " + fats.getName());
            System.out.println();
        }
    }
}
