public class Demo7 {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Demo7(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("----------------------------");
    }

   
    public void giveIncrement() {
        double increment = salary * 0.05;
        salary += increment;
    }

    
    public static void main(String[] args) {
       
        Demo7 emp1 = new Demo7 ("Alice Johnson", 101, 50000);

    
        System.out.println("Before Increment:");
        emp1.displayDetails();

     
        emp1.giveIncrement();

       
        System.out.println("After Increment:");
        emp1.displayDetails();
    }

    
}
