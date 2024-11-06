import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks obtained (0-100): ");
        int marks = scanner.nextInt();        
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            switch (marks / 10) {
                case 7,8,9,10 :  // If marks between 70 - 100
                System.out.println("Grade: Distinction");
                break;
                case 6:   // if marks between 60 - 69
                    System.out.println("Grade: First Class");
                    break;
                case 5 :   // 50 - 59
                    System.out.println("Grade: Second Class");
                    break;
                case 4:   // 40 - 49
                    System.out.println("Grade: Pass");
                    break;
                case 0,1,2,3:   // 0 - 39
                    System.out.println("Grade: Fail");
                    break;
            }
        }
    }
}
