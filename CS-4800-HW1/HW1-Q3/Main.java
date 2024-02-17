


// Main.java
public class Main {
    public static void main(String[] args) {
        // Create Instructor instances
        Instructor instructor1 = new Instructor("Nima", "Davarpnah", "3-2636");
        Instructor instructor2 = new Instructor("Jane", "Doe", "4-5678");

        // Create Textbook instances
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        // Create Course instances
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Advanced Java Programming", instructor2, textbook2);

        // Print course details
        course1.print();
        System.out.println(); // Print a blank line for readability
        course2.print();
    }
}
