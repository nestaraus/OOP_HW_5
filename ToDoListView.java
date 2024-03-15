import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public int choise() {
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

    public String takeTask() {
        System.out.println("Введите новую задачу: ");
        return scanner.next().toString();
    }

    public void showToDoList(ArrayList<String> toDoList) {
        for (String task : toDoList) {
            System.out.print("+"+task+"\n");
            System.out.println();
        }
    }
    

}