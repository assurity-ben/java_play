public class ThreadClass extends Thread {
    public void run() {
        P.print("This is running inside a thread");
    }
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.start();
        P.print("This code is outside the thread");
    }
}


class Thread2 implements Runnable {
    public void run() {
        P.print("This is inside the Runnable thread");
    }
    public static void main(String[] args) {
        Thread2 runner = new Thread2();
        Thread thread = new Thread(runner);
        thread.start();
        P.print("This code is outside the runnable thread");
    }
}

class Main2 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main2 thread = new Main2();
        thread.start();
        System.out.println("Main: " + amount);
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }
}