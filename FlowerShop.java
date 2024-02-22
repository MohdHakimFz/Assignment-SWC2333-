/**
 * Program Purpose: To demonstrate the implementation of instance variables and 
 *                  methods of the class named FlowerShop
 * Programmer: MOHD HAKIM BIN MOHD FAUZI
 * Matrix Programmer: AM2307014329
 * Date: 22 February 2024
 */
import java.util.Scanner;

public class FlowerShop {
    private Flower[] inventory = new Flower[10];

    public void Management() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("\n--- Enter details for flower " + (i + 1) + " ---");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Price: RM");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();  // consume newline left-over
            inventory[i] = new Flower(name, color, price, quantity);
        }

        // Display all flower details
        System.out.println("\n--- Flower Details ---");
        for (Flower flower : inventory) {
            System.out.println(flower);
        }

        // Calculate and display the total value of the flower inventory
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("\n--- Total Value of the Flower Inventory ---");
        System.out.println("Total value: " + totalValue);

        // Allow the user to search for a flower by name and display its details
        System.out.println("\n--- Search for a Flower ---");
        System.out.print("Enter the name of the flower you want to search for: ");
        String searchName = scanner.nextLine();
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found flower: " + flower);
                break;
            }
        }

        // Implement a method to restock a specific flower in the inventory
        System.out.println("\n--- Restock a Flower ---");
        System.out.print("Enter the name of the flower you want to restock: ");
        String restockName = scanner.nextLine();
        System.out.print("Enter the new quantity: ");
        int newQuantity = scanner.nextInt();
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(restockName)) {
                flower.setQuantity(newQuantity);
                System.out.println("Updated flower details: " + flower);
                break;
            }
        }

        // Display all flower details and total value after restocking
        System.out.println("\n--- Updated Flower Details and Total Value ---");
        totalValue = 0;
        for (Flower flower : inventory) {
            System.out.println(flower);
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("Updated total value: " + totalValue);
        
        

        scanner.close();
    }

    public static void main(String[] args) {
        new FlowerShop().Management();
    }
}
