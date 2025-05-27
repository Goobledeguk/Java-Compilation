import java.util.Scanner;

public class Stack{
	int[] stack;
	int top;
	int capacity;

public StackMethod(int size){
	stack = new int(size);
	top = -1;
	capacity = size;
}

public void push(int value){
if(isFull()){
	System.out.println("Stack Full");
	return;
	}
	stack[top++] = value;
	System.out.print("Value Pushed");
}


public void pop(){
if(isEmpty()){
	System.out.println("Empty!");
	return;
	}
	int removed = stack[top--];
	System.out.print(removed + "popped");
}

public void deleteAtPosition(int position){
if (position < 0 || position > rear - front){
		System.out.println("Invalid Position");
		return; }

		for (int i = top - position; i < top; i++);{
			stack[i] = stack[i+1];
		}
		top--;
}




public void peek(int position){
	for( int i = top; i >= 0; i--);{
			if(stack[i] == position) {
				System.out.print("Value found at the "+ (i - top));
				return;
			}
		}
				System.out.println("Not found");
}



public boolean isEmpty(){
return top == -1;

}

public boolean isFull(){
return top == capacity - 1;

}

public static void main(String[]arg){
	Scanner in = new Scanner(System.in);
	Stack stack = new Stack();
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
			stack.push(value);
			break;
	case 2:
			stack.pop();
			break;
	case 3:
			System.out.print("Enter a position to remove: ");
			position = in.nextInt();
			stack.deleteAtPosition(position);
			break;
	case 4:
			System.out.print("Enter a position to search: ");
			position = in.nextInt();
			stack.search(position);
			break;
	case 5:
			System.out.print(stack());
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