package ExamPrep.Module4;

//Write a Java program that demonstrates basic multithreading using the
//Thread class. Create two threads that print messages concurrently.

public class BasicMultithreading {
    public static void main(String[] args) {
        // Create and start Thread 1
        Thread thread1 = new Thread(new MessagePrinter("Thread 1!"));
        thread1.start();

        // Create and start Thread 2
        Thread thread2 = new Thread(new MessagePrinter("Thread 2!"));
        thread2.start();
    }
}

// Runnable implementation for printing messages
class MessagePrinter implements Runnable {
    private final String message;
    public MessagePrinter(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000); // Pause for 1 second between messages
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
