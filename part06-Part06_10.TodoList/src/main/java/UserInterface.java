import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {

                case "stop":
                    return;

                case "add":
                    this.addToTodoList();
                    break;

                case "list":
                    this.todoList.print();
                    break;

                case "remove":
                    this.removeFromList();
                    break;

                default:
                    break;
            }
        }
    }

    private void addToTodoList() {
        System.out.println("To add: ");
        String task = scanner.nextLine();

        this.todoList.add(task);
    }

    private void removeFromList() {
        System.out.println("Which one is removed?");

        int index = Integer.valueOf(scanner.nextLine());

        this.todoList.remove(index);

    }

}
