import java.util.Scanner;

public class Queue1 {
    static class Queue {
        private int[] arr;
        private int front, rear, capacity;

        public Queue(int size) {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
        }

        public void enqueue(int val) {
            if (isFull()) {
                System.out.println("Full!");
                return;
            }
            arr[++rear] = val;
            System.out.println("Queued");
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Empty!");
                return;
            }
            System.out.println( "Dequeued.");
            front++;
        }

        public void deleteAtPosition(int position) {
            if (position < 0 || position > rear - front) {
                System.out.println("Invalid position");
                return;
            }
            int indexToDelete = front + position;
     
            for (int i = indexToDelete; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println( "Dequeued.");
            rear--;
        }

        public void search(int position) {
            for (int i = front; i <= rear; i++) {
                if (arr[i] == position) {
                    System.out.println(position + " found at position " + (i - front) + " from front.");
                    return;
                }
            }
            System.out.println(position + " not found in queue.");
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue elements (front to rear): ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public boolean isFull() {
            return rear == capacity - 1;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        Scanner scanner = new Scanner(System.in);
        int choice, value, position;

        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete at beginning)");
            System.out.println("3. Delete at position");
            System.out.println("4. Search");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.print("Enter position (0 = front): ");
                    position = scanner.nextInt();
                    queue.deleteAtPosition(position);
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();
                    queue.search(value);
                    break;
                case 5:
                    queue.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
