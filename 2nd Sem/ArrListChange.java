import java.util.LinkedList;
import java.util.Scanner;

public class ArrListChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        LinkedList<String> list = new LinkedList<>();
    
        
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add element to LinkedList");
            System.out.println("2. Change element in LinkedList");
            System.out.println("3. Remove element from LinkedList");
            System.out.println("4. Display LinkedList");
            System.out.println("5. Exit");
            
            int chc = in.nextInt();
            in.nextLine();
            
            switch (chc) {
                case 1:
                    System.out.print("Enter element to add to LinkedList: ");
                    String add = in.nextLine();
                    list.add(add);
                    System.out.println("Element added successfully.");
                    break;

                case 2:
                    System.out.print("Enter index of the element to change: ");
                    int index = in.nextInt();
                    in.nextLine();
                    if (index >= 0 && index < list.size()) {
                        System.out.print("Enter new element: ");
                        String upd = in.nextLine();
                        list.set(index, upd);
                        System.out.println("Element changed successfully.");
                    } else {
                        System.out.println("Invalid index! Please try again.");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to remove from LinkedList: ");
                    String rmv = in.nextLine();
                    if (list.remove(rmv)) {
                        System.out.println("Element removed successfully.");
                    } else {
                        System.out.println("Element not found in LinkedList.");
                    }
                    break;

                case 4:
                    System.out.println("Current LinkedList: " + list);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
