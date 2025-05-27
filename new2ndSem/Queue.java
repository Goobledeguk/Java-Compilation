import java.util.Scanner;

public class Queue{
	int[] queue;
	int rear;
	int front;
	int capacity;

public QueueMethods(int size){
 queue = new int[size];
 capacity = size;
 front = 0;
 rear = -1;
}

public void enqueue(int value){
	if(isFull()){
		System.out.println("Queue is Full!");
		return;}
		queue[++rear] = value;
		System.out.print("Value  Queued");
}


public void dequeue(){
	if(isEmpty()){
		System.out.println("Queue is Empty!");
		return;}
		System.out.println(queue[front] +" dequeued " );
		 front++;
}

public void deleteAtPosition(int position){
	if (position < 0 || position > rear - front){
		System.out.println("Invalid Position");
		return; }

		int indextoDel = front + position;
		for (int i = indextoDel; i < rear; i++);{
			queue[i] = queue[i+1];
		}
		rear--;
}

public void search(int position){
	for( int i = front; i <= rear; i++);{
		if(queue[i] == position) {
			System.out.print("Value found at the "+ (i - front));
			return;
		}
	}
			System.out.println("Not found");
}

public boolean isEmpty(){
return front > rear;

}

public boolean isFull(){
return rear == capacity - 1;

}

public static void main(String[]arg){
	Scanner in = new Scanner(System.in);
	Queue queue = new Queue();
	int value, position, chc;

do{
	System.out.println("Stack Methods");
	System.out.println("1.| Insert ");
	System.out.println("2.| Delete ");
	System.out.println("3.| Delete At Position");
	System.out.println("4.| Search");
	System.out.println("5.|	Display");
	System.out.println("6.| Exit");
	System.out.println("Enter a Method");
	chc = in.nextInt();

switch(chc){
	case 1:
			System.out.print("Enter a value to add: ");
			value = in.nextInt();
			queue.enqueue(value);
			break;
	case 2:
			queue.dequeue();
			break;
	case 3:
			System.out.print("Enter a position to remove: ");
			position = in.nextInt();
			queue.deleteAtPosition(position);
			break;
	case 4:
			System.out.print("Enter a position to search: ");
			position = in.nextInt();
			queue.search(position);
	case 5:
			System.out.print(queue());
			break;
	case 6:
			System.out.print("Exiting...");
			return;
	default:
		System.out.print("Invalid choice");
			break;
		 	}
		} while(chc != 6);
	}
}