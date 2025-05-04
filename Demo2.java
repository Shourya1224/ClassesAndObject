public class Demo2 {

    private double length;
    private double breadth;


    public Demo2(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

 
    public double calculateArea() {
        return length * breadth;
    }

  
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

   
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("--------------------------");
    }

   
    public static void main(String[] args) {
        
        Demo2 rect1 = new Demo2(10, 5);
        Demo2 rect2 = new Demo2(7.5, 3.2);
        Demo2 rect3 = new Demo2(4, 4);

        
        rect1.display();
        rect2.display();
        rect3.display();
    }

    
    
}
