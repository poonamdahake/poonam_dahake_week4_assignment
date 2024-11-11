import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student 2. Remove Student 3. Display Students 4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                students.add(scanner.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter student name to remove: ");
                String name = scanner.nextLine();
                if (students.remove(name)) {
                    System.out.println("Removed " + name);
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 3) {
                System.out.println("Students: " + students);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
