import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[]args) {
        Scanner scanner = new scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("Wecome to Your TO-Do List!");
        
        while(true) {
            System.out.println("\nwhat would you like to do?");
            System.out.println("1. View tasks");
            System.out.println("2. Add task");
            System.out.println("3. Remove");
            System.out.println("4. Remove");

            System.out.println("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nexrLine(); // consume newline

            switch(choice) {
                case 1:
                     System.out.println("\n Your tasks:");
                if (task.isEmpty()) {
                    System.out.println("You have no tasks!");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + "." + tasks.get(i));
                    }
                }
                break;

                case 2:
                    System.out.println("Enter a task to add: ");
                    String newTask = scanner.nextLine();
                    task.add(newTask);
                    System.out.println("Task added!");
                    break;

                case 3: 
                    System.out.println("Enter the number of the task to remove: ");
                    int removeTask = scanner.nextLine();
                    scanner.nextLine(); // consume newline

                    if (removeIndex > 0 && removeIndex <= task.size()) {
                        task.remove(removeIndex - 1);
                        System.out.println("Task Removed.");
                    } else {
                        System.out.println(Invalid task number.);
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;     
                default;
                    System.out.println("Please enter valid option.")              
            }
        }
    }
}