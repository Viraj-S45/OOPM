import java.util.Scanner;

class Circle {
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a Sphere: ");
        return sc.nextInt();
    }

    public static void display(int radius) {
        System.out.println("The radius of the sphere is: " + radius);
    }
}

class Area extends Circle {
    public static double calculateArea(int radius) {
        return 4 * (22.0 / 7) * radius * radius;
    }

    public static void displayArea(double area) {
        System.out.println("Area of Sphere is: " + area);
    }
}

class Volume extends Area {
    public static double calculateVolume(int radius) {
        return (4.0 / 3) * (22.0 / 7) * radius * radius * radius;
    }

    public static void displayVolume(double volume) {
        System.out.println("Volume of Sphere is: " + volume);
    }
}

public class Exp8 {
    public static void main(String[] args) {
        int radius = Circle.getInput();
        Circle.display(radius);

        double area = Area.calculateArea(radius);
        Area.displayArea(area);

        double volume = Volume.calculateVolume(radius);
        Volume.displayVolume(volume);
    }
}
