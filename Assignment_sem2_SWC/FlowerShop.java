/**
 * Description: Java program of driver class name Flower Shop for the flower management system
 * Name: Nur Athirah Binti Hilalluddin
 * Date:19/2/2024
 */

//using jOptionPane to display 
import javax.swing.JOptionPane;

public class FlowerShop {
    public static void main(String[] args) {
        // Creating an array with size 10 for flower inventory
        FlowerClass[] invFlowers = new FlowerClass[10];

        // Prompt user to enter flower data to store in the array
        for (int i = 0; i < invFlowers.length; i++) 
        {
            String name = JOptionPane.showInputDialog("Enter the name of flower " + (i + 1) );
            String color = JOptionPane.showInputDialog("Enter the color of flower " + (i + 1) );
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of flower " + (i + 1) ));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of flower " + (i + 1) ));
            invFlowers[i] = new FlowerClass(name, color, price, quantity);
        }

        //using StringBuilder to display all flower detail in 1 single JOption dialog box
        // Display all flower details
        StringBuilder flowerDetail = new StringBuilder("FLOWER DETAILS\n");
        for (FlowerClass flower : invFlowers) 
        {
            flowerDetail.append(flower.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, flowerDetail.toString());

        // Calculate and display total value of flower inventory
        double totalValue = 0;
        for (FlowerClass flower : invFlowers) 
        {
            totalValue += flower.calcCost();
        }
        JOptionPane.showMessageDialog(null, "Total Value of Flower Inventory: RM" + totalValue);

        // Allow user to search for a flower by name and display its details
        String searchName = JOptionPane.showInputDialog("Enter the name of the flower to search in the inventory");
        boolean found = false;
        for (FlowerClass flower : invFlowers) 
        {
            if (flower.getName().equalsIgnoreCase(searchName)) 
            {
                JOptionPane.showMessageDialog(null, "Flower\n" + flower.toString());
                found = true;
                break;
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(null, "Flower not found.");
        }

        // Restock a specific flower in the inventory
        String restockName = JOptionPane.showInputDialog("Enter the name of the flower to restock");
        int restockFlower = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity to restock"));
        for (FlowerClass flower : invFlowers) 
        {
            if (flower.getName().equalsIgnoreCase(restockName)) 
            {
                flower.setFlowerClass(flower.getName(), flower.getColor(), flower.getPrice(), flower.getQuantity() + restockFlower);
                JOptionPane.showMessageDialog(null, "Restocked " + restockFlower + " of " + restockName);
                break;
            }
        }
        
        // Update the flower details after restocking
        StringBuilder newFlowerDetail = new StringBuilder("UPDATED FLOWER DETAILS\n");
        for (FlowerClass flower : invFlowers) 
        {
            newFlowerDetail.append(flower.toString()).append("\n");
        }
        // displaying the latest inventory after restocking
        JOptionPane.showMessageDialog(null, newFlowerDetail.toString());

    }
}
