public class Demo1{

    private String name;
    private int rollNumber;
    private double marks;

   
    public Demo1(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------------");
    }

   
    public static void main(String[] args) {
       
        Demo1 student1 = new Demo1("Alice", 101, 88.5);
        Demo1 student2 = new Demo1("Bob", 102, 76.0);
        Demo1 student3 = new Demo1("Charlie", 103, 92.3);

       
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }


}