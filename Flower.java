/**
 * Program Purpose: To demonstrate the implementation of instance variables and 
 *                  methods of the class named Flower\
 * Programmer: MOHD HAKIM BIN MOHD FAUZI
 * Matrix Programmer: AM2307014329
 * Date: 22 February 2024
 */
public class Flower {
    // Declare private instance variables for the Flower class
    private String name;
    private String color;
    private double price;
    private int quantity;

    // Constructor for the Flower class
    public Flower(String name, String color, double price, int quantity) {
        // Initialize instance variables with the values passed to the constructor
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter (accessor) method for the 'name' instance variable
    public String getName() {
        return name;
    }

    // Setter (mutator) method for the 'name' instance variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter (accessor) method for the 'color' instance variable
    public String getColor() {
        return color;
    }

    // Setter (mutator) method for the 'color' instance variable
    public void setColor(String color) {
        this.color = color;
    }

    // Getter (accessor) method for the 'price' instance variable
    public double getPrice() {
        return price;
    }

    // Setter (mutator) method for the 'price' instance variable
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter (accessor) method for the 'quantity' instance variable
    public int getQuantity() {
        return quantity;
    }

    // Setter (mutator) method for the 'quantity' instance variable
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the value of the flower based on its price and quantity
    public double getValue() {
        return price * quantity;
    }

    // Method to return a string representation of the Flower object
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", value=" + getValue() +
                '}';
    }
}
