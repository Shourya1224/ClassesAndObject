public class Demo10 {
    private String brand;
    private int RAM; // in GB
    private double price;

    // Constructor
    public Demo10(String brand, int RAM, double price) {
        this.brand = brand;
        this.RAM = RAM;
        this.price = price;
    }

    // Method to display laptop details
    public void displayDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Price: $" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        Demo10 myLaptop = new Demo10("Dell", 16, 799.99);
        myLaptop.displayDetails();
    }
    
}
