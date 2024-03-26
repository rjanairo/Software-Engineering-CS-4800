

public class Customer {
    private final String name;
    private final DietType dietType;

    public Customer(String name, DietType dietType) {
        this.name = name;
        this.dietType = dietType;
    }

    public String getName() {
        return name;
    }

    public DietType getDietType() {
        return dietType;
    }
}
