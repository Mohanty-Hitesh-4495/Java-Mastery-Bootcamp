import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

public class ToDoListManager extends JFrame {
    private JTextField taskInput;
    private JComboBox<String> priorityInput;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private PriorityQueue<Task> tasks;

    public ToDoListManager() {
        super("ToDo List Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        taskInput = new JTextField(20);
        priorityInput = new JComboBox<>(new String[]{"High", "Medium", "Low"});
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(new AddButtonListener());

        inputPanel.add(new JLabel("Task:"));
        inputPanel.add(taskInput);
        inputPanel.add(new JLabel("Priority:"));
        inputPanel.add(priorityInput);
        inputPanel.add(addButton);

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        taskList.setFixedCellHeight(30);
        JScrollPane scrollPane = new JScrollPane(taskList);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        getContentPane().setBackground(new Color(240, 240, 240)); // Set background color
        setLocationRelativeTo(null); // Center the window

        tasks = new PriorityQueue<>();

        updateTaskList(); // Initialize task list
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String task = taskInput.getText();
            String priority = (String) priorityInput.getSelectedItem();
            int priorityValue;
            switch (priority) {
                case "High":
                    priorityValue = 3;
                    break;
                case "Medium":
                    priorityValue = 2;
                    break;
                default:
                    priorityValue = 1;
            }
            Task newTask = new Task(task, priorityValue);
            tasks.add(newTask);
            updateTaskList();
            taskInput.setText("");
        }
    }

    private void updateTaskList() {
        taskListModel.clear();
        for (Task task : tasks) {
            taskListModel.addElement(task.toString());
        }
    }

    private class Task implements Comparable<Task> {
        private String description;
        private int priority;

        public Task(String description, int priority) {
            this.description = description;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task other) {
            // Higher priority tasks come first
            return Integer.compare(other.priority, this.priority);
        }

        @Override
        public String toString() {
            return "<html><font color='blue'>" + description + "</font> - Priority: " + priority + "</html>";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Set cross-platform Java L&F (also called "Metal")
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            ToDoListManager todoListManager = new ToDoListManager();
            todoListManager.setVisible(true);
        });
    }
}
