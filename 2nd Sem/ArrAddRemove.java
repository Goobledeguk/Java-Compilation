import java.util.Scanner;
import java.util.LinkedList;

public class ArrAddRemove {
    public static void main(String[]args){ 
        LinkedList list = new LinkedList<>(); 
        Scanner in = new Scanner(System.in); 

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add element to LinkedList");
            System.out.println("2. Remove element from LinkedList");
            System.out.println("3. Display LinkedList");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            in.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add to LinkedList: ");
                    list.add(in.nextLine());
                    System.out.println("Added to LinkedList.");
                    break;

                case 2:
                    System.out.print("Enter element to remove from LinkedList: ");
                    String rmv = in.nextLine();
                    if (list.remove(rmv)) {
                        System.out.println("Removed from LinkedList.");
                    } else {
                        System.out.println("Element not found in LinkedList.");
                    }
                    break;

                case 3:
                    System.out.println("LinkedList: " + list);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }




    }
}
