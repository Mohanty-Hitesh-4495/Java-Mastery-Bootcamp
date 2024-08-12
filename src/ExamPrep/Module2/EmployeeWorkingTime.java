package ExamPrep.Module2;

// Write a Java program that calculates the total working time of an employee
// using a Time class with instance variables hours and minutes.

class Time {
    private int hours;
    private int minutes;

    // Constructor to initialize hours and minutes
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to calculate total working time
    public Time calculateWorkingTime(Time leavingTime) {
        int totalHours;
        int totalMinutes;

        totalHours = leavingTime.hours - this.hours;
        totalMinutes = leavingTime.minutes - this.minutes;

        if (totalMinutes < 0) {
            totalHours--;
            totalMinutes += 60;
        }
        return new Time(totalHours, totalMinutes);
    }
    // Method to display total working time
    public void displayTotalWorkingTime() {
        System.out.println("Total Working Time: " + hours + " hours " + minutes + " minutes");
    }
}
public class EmployeeWorkingTime {
    public static void main(String[] args) {
        // Creating Time objects for entry and leaving times
        Time entryTime = new Time(9, 0); // Entry time: 9:00
        Time leavingTime = new Time(17, 30); // Leaving time: 17:30

        // Calculating and displaying total working time
        Time totalWorkingTime = entryTime.calculateWorkingTime(leavingTime);
        totalWorkingTime.displayTotalWorkingTime();
    }
}

