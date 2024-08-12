 
import java.util.PriorityQueue;
 
class Task implements Comparable<Task> {
    private String name;
    private int priority;
 
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
 
    public String getName() {
        return name;
    }
 
    public int getPriority() {
        return priority;
    }
 
    @Override
    public int compareTo(Task other) {
        // Tasks are compared based on their priorities
        return Integer.compare(this.priority, other.priority);
    }
 
    @Override
    public String toString() {
        return "[" + name + ", Priority: " + priority + "]";
    }
}
 
public class PriorityQueueToDoList {
 
    public static void main(String[] args) {
        PriorityQueue<Task> toDoQueue = new PriorityQueue<>();
 
        // Adding tasks to the to-do list with different priorities
        toDoQueue.offer(new Task("Task 1", 3));
        toDoQueue.offer(new Task("Task 2", 1));
        toDoQueue.offer(new Task("Task 3", 2));
        toDoQueue.offer(new Task("Task 4", 4));
        toDoQueue.offer(new Task("Task 5", 2));
 
        // Processing tasks in priority order
        while (!toDoQueue.isEmpty()) {
            Task task = toDoQueue.poll();
            System.out.println("Task Completed: " + task);
        }
    }
}