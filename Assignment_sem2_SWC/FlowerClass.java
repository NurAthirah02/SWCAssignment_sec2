
/**
 * Description: Java program of definition for the Flower Class to manage flower inventory
 * Name: Nur Athirah Binti Hilalluddin
 * Date:19/2/2024
 */
public class FlowerClass
{
    // declare the given instance variables
    private String name;
    private String color;
    private double price;
    private int quantity;

    //empty constructor
    public FlowerClass()
    {
        // initialise instance variables  ("")/(null) = string
        name = null;
        color = null;
        price = 0.0;
        quantity = 0;
    }

    //constructor with parameter
    public FlowerClass(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    
    //accessor method
    public String getName(){return name;}
    
    public String getColor(){ return color;}
    
    public double getPrice() { return price;}
    
    public int getQuantity() { return quantity;} 
    
    //mutator methods
    public void setFlowerClass(String name, String color, double price, int quantity) 
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity= quantity;
    }
    
    //calculation method
    public double calcCost () 
    {
        return price * quantity;
    }
    
    //toString method to display flower details
        public String toString() 
    {
        return "Flower name = " + getName() + 
               "\nThe color of flower = " + getColor() +
               "\nPrice of flower = RM" + getPrice() +
               "\nQuantity of flower = " + getQuantity();
    }
}
