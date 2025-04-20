import java.util.Scanner; 


public class PushStack {
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
        
        public boolean isEmpty() {
            return top == -1;
        }
}
public static void main(String[] args) {
    Stack stack = new Stack(10);
    Scanner scanner = new Scanner(System.in);
    int choice, value;

    do {
        System.out.println("Stack Push Operation:");
        System.out.println("1. Insert");
        System.out.println("2. Display");
        System.out.println("3. Exit....");

        System.out.print("Enter choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter value to push: ");
                value = scanner.nextInt();
                stack.push(value);
                break;
            case 2:
                stack.display();
                break;
            case 3:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    } while (choice != 3);

 
}
}

