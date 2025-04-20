import java.util.Scanner;

public class Stack1{
    static class Stack {
        private int[] arr;
        private int top;
        private int capacity;


        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

 
        public void push(int item) {
            if (isFull()) {
                System.out.println("Full!");
                return;
            }
            arr[++top] = item;
            System.out.println( "Added to the stack.");
        }

     
        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Empty!");
                return;
            }
            int removed = arr[top--];
            System.out.println("Removed from the stack.");
        }

      
        public void DelPos(int position) {
            if (position < 0 || position > top) {
                System.out.println("Invalid position");
                return;
            }
            
            for (int i = top - position; i < top; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("Removed from the stack.");
            top--;
        }

        public void search(int key) {
            for (int i = top; i >= 0; i--) {
                if (arr[i] == key) {
                    System.out.println(key + " found at position " + (top - i) + " from top.");
                    return;
                }
            }
            System.out.println(key + " not found in stack.");
        }

  
        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Scanner scanner = new Scanner(System.in);
        int choice, value, position;

        do {
            System.out.println("Stack Operations:");
            System.out.println("1. Insert");
            System.out.println("2.Delete at beginning");
            System.out.println("3. Delete at position");
            System.out.println("4. Search");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.print("Enter position (0 = top): ");
                    position = scanner.nextInt();
                    stack.DelPos(position);
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();
                    stack.search(value);
                    break;
                case 5:
                    stack.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

     
    }
}
