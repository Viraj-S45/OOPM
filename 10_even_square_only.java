import java.util.Scanner;

class OddException extends Exception {
    OddException(String s) {
        super(s);
    }
}

class Expt_10 {
    static void validate(int no) throws OddException {
        if (no % 2 != 0)
            throw new OddException("Enter an even number");
        else
            System.out.println(no * no);
    }

    public static void main(String args[]) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.: ");
        no = sc.nextInt();
        try {
            validate(no);
        } catch (Exception m) {
            System.out.println(m);
        }
    }
}
