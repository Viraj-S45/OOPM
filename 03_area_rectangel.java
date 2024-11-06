import java.util.*;

class Rectangle {
    
    private double length;
    private double breadth;

    
    public void getDim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }

    
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        
        
        rect.getDim();
        
        
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter());
    }
}