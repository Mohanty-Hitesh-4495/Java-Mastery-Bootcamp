package Manual;

class ChildThread extends Thread {
    public void run() {
        System.out.println("Child Thread executing...");
        // Simulating some work
        try {
            Thread.sleep(2000); // Simulating thread work for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child Thread completed.");
    }
}

public class MainThread {
    public static void main(String[] args) {
        ChildThread thread1 = new ChildThread();
        ChildThread thread2 = new ChildThread();
        try {
            // Waiting for thread1 to complete
            thread1.start();
            thread1.join();
            System.out.println("Thread 1 has completed.");

            // Waiting for thread2 to complete
            thread2.start();
            thread2.join();
            System.out.println("Thread 2 has completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting...");
    }
}

