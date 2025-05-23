// Thread using extends Thread
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 - Message " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            }
        }
    }
}

// Thread using implements Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 - Message " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1(); // Thread by extending Thread
        Thread t2 = new Thread(new MyRunnable()); // Thread by implementing Runnable

        // Start both threads
        t1.start();
        t2.start();
    }
}
