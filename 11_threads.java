class T1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class T2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}

public class Exp11 {
    public static void main(String args[]) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
