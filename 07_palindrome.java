import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        String str, rev;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        StringBuffer str1 = new StringBuffer(str);

        str1.reverse();

        rev = str1.toString();

        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
