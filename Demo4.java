public class Demo4 {
    private String brand;
    private String model;
    private double price;

    public Demo4(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

  
    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("----------------------------");
    }

 
    public static void main(String[] args) {
       
        Demo4 car1 = new Demo4("Toyota", "Camry", 28000);
        Demo4 car2 = new Demo4("Honda", "Civic", 24000);
        Demo4 car3 = new Demo4("Tesla", "Model 3", 39000);

    
        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
    }
}
    

