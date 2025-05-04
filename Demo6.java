public class Demo6 {

    private String title;
    private String author;
    private double price;

    
    public Demo6(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void applyDiscount() {
        double discount = price * 0.10;
        double finalPrice = price - discount;
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount (10%): $" + discount);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("-----------------------------");
    }

   
    public static void main(String[] args) {
        
        Demo6 book1 = new Demo6("The Alchemist", "Paulo Coelho", 499.99);
        Demo6 book2 = new Demo6("1984", "George Orwell", 299.50);

        
        book1.applyDiscount();
        book2.applyDiscount();
    }
}
    

