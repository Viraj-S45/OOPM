import java.util.Scanner;
public class complexnumber {
    static class Complex {
        int real;
        int img;
        Complex() {
            this.real = 0;
            this.img = 0;
        }
        Complex(int r, int i) {
            this.real = r;
            this.img = i;
        }
        public int sum() {
            return this.real + this.img;
        }
        public void print() {
            System.out.println("Complex Number: " + this.real + " + " + this.img + "i");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex c = new Complex();
        System.out.println("Enter the real part of the 1st complex number:");
        c.real = sc.nextInt(); 
        System.out.println("Enter the imaginary part of the 1st complex number:");
        c.img = sc.nextInt(); 
        c.print();
        System.out.println("Sum of the real and imaginary parts: " + c.sum());
        System.out.println("Enter the real part of the 2nd complex number:");
        int x = sc.nextInt();
        System.out.println("Enter the imaginary part of the 2nd complex number:");
        int y = sc.nextInt();
        Complex d = new Complex(x, y);
        d.print();
        System.out.println("Sum of the real and imaginary parts: " + d.sum());
    }
}
