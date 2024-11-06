class Shapes {
//Square
    public int area(int side) {
        return side * side;
    }
//Rectangle
    public int area(int length, int width) {
        return length * width;
    }
//Triangle
    public double area(int base, int height, int dummy) {
        // Using 0.5 * base * height to calculate the area of the triangle
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        // Creating an object of Shapes class
        Shapes shape = new Shapes();
        int squareArea = shape.area(5); // Area of square
        int rectangleArea = shape.area(4, 6); // Area of rectangle
        double triangleArea = shape.area(3, 4, 0); // Area of triangle
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
