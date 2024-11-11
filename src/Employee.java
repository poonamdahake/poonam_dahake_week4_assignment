import java.util.HashMap;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee\n2. Get Employee\n3. Display All Employees\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                employees.put(id, name);
                System.out.println("Employee added: ID=" + id + ", Name=" + name);
            } else if (choice == 2) {
                System.out.print("Enter Employee ID to search: ");
                int id = scanner.nextInt();
                String name = employees.get(id);
                if (name != null) {
                    System.out.println("Employee found: ID=" + id + ", Name=" + name);
                } else {
                    System.out.println("Employee not found for ID=" + id);
                }
            } else if (choice == 3) {
                System.out.println("Employee List:");
                employees.forEach((id, name) -> System.out.println("ID=" + id + ", Name=" + name));
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}

