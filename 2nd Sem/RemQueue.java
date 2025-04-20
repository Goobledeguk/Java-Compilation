import java.util.Scanner; 

public class RemQueue {
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
        int choice, value;

        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue ");
            System.out.println("3. Display");
            System.out.println("4. Exit");
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
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);


    }

}