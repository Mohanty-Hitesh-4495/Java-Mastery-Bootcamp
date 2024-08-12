package ExamPrep.Module4;

// What is a daemon thread in Java? How does it differ from a user thread? Give an Example.
/*
In Java, a daemon thread is a type of thread that runs in the background, providing services to user threads or other threads in the system.
The main distinction between a daemon thread and a user thread lies in their behavior when the JVM (Java Virtual Machine) exits.
1. Daemon Thread:
    ->A daemon thread is a thread that runs in the background.
    ->It is used to provide services to user threads or perform background tasks.
    ->The JVM doesn't wait for daemon threads to finish their execution before terminating.
     When all user threads finish their execution and there are only daemon threads remaining, the JVM exits, abruptly terminating these daemon threads.
    ->An example of a daemon thread is the garbage collector, which runs in the background to reclaim memory by removing unused objects.
2. User Thread:
    ->A user thread is a thread explicitly created by the application developer.
    ->These threads execute application logic and perform specific tasks required by the application.
    ->The JVM waits for user threads to complete their execution before shutting down.
     If any user thread is running, the JVM will not exit even if all other non-daemon threads have finished.
 */
public class DaemonUserThreadExample {
    public static void main(String[] args) {
        // Creating a user thread
        Thread userThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("User Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Setting a thread as daemon
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true); // Setting the thread as daemon

        userThread.start(); // Starting the user thread
        daemonThread.start(); // Starting the daemon thread

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is exiting");
    }
}
