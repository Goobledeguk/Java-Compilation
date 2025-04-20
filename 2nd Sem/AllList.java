import java.util.LinkedList;
import java.util.Scanner;

public class AllList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice, element;

        do {
            System.out.println("1. Insert at beginning");
            System.out.println("2. Delete from beginning");
            System.out.println("3. Display list");
            System.out.println("4. Search for an element");
            System.out.println("5. Delete a specific element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = sc.nextInt();
                    list.addFirst(element);
                    System.out.println("Inserted " + element + " at the beginning.");
                    break;

                case 2:
                    if (!list.isEmpty()) {
                        element = list.removeFirst();
                        System.out.println("Deleted element: " + element);
                    } else {
                        System.out.println("List is empty!");
                    }
                    break;

                case 3:
                    System.out.println("Current List: " + list);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    element = sc.nextInt();
                    if (list.contains(element)) {
                        System.out.println("Element " + element + " is present in the list.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter element to delete: ");
                    element = sc.nextInt();
                    if (list.remove(Integer.valueOf(element))) {
                        System.out.println("Deleted element: " + element);
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}