public class Demo5 {
    public class Circle {
       
        private double radius;
    
       
        public Circle(double radius) {
            this.radius = radius;
        }
    
       
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    
       
        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }
    
        
        public void displayDetails() {
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + calculateArea());
            System.out.println("Circumference: " + calculateCircumference());
            System.out.println("----------------------------");
        }
    
     
        public static void main(String[] args) {
           
            Demo5 circle1 = new Circle(5);
            Demo5 circle2 = new Circle(10.5);
    
           
            circle1.Demo5 ();
            circle2.Demo5 ();
        }
    }







    
}
