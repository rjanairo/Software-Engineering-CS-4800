
// Main.java
public class Main {
    public static void main(String[] args) {
        // Array of Ship objects
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Lusitania", "1906");
        ships[1] = new CruiseShip("Titanic", "1912", 3327);
        ships[2] = new CargoShip("Maersk", "1996", 200000);

        // Loop through the array calling each print function
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
