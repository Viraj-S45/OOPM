import java.util.*;

class Matrix {
    int a[][], b[][], sum[][], t[][];
    int r, c, i, j;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        r = sc.nextInt();
        c = sc.nextInt();

        a = new int[r][c];
        b = new int[r][c];

        System.out.println("Enter First Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void addition() {
        sum = new int[r][c];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void display() {
        System.out.println("Sum of the two matrices:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        t = new int[c][r];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                t[j][i] = sum[i][j];
            }
        }

        System.out.println("Transpose of the sum matrix:");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.read();
        matrix.addition();
        matrix.display();
        matrix.transpose();
    }
}
