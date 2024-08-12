package ExamPrep.Module4;

// Implement a multithreaded program using the Runnable interface.

public class MultiThreadedExample {
    public static void main(String[] args) {

        // Create threads and assign RunnableTask instances to them
        Thread thread1 = new Thread(new RunnableTask("Task 1"));
        Thread thread2 = new Thread(new RunnableTask("Task 2"));
        Thread thread3 = new Thread(new RunnableTask("Task 3"));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// Runnable implementation
class RunnableTask implements Runnable {
    private final String taskName;

    public RunnableTask(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(taskName + " finished execution.");
    }
}
