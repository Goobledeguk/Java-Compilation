import java.util.Scanner;
import java.util.LinkedList;

	public class LinkList{
		public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		LinkedList link = new LinkedList();
	while(true){
		System.out.println("======================");
		System.out.println("Linked List Operations");
		System.out.println("1.| Display");
		System.out.println("2.| Add");
		System.out.println("3.| Search");
		System.out.println("4.| Update");
		System.out.println("5.| Delete ");
		System.out.println("6.| Empty");
		System.out.println("7.| Exit");
		System.out.print("Enter your desired operation: ");
		int chc = in.nextInt();

		switch(chc){
			case 1:
				if(link.isEmpty()){
				System.out.println("Empty!");
				}else{
			System.out.println(link);
			}
			break;

			case 2:
			System.out.print("Enter a value to add: ");
			int value = in.nextInt();
			link.add(value);
			System.out.println("Value Added!");
			break;

			case 3:
				if(link.isEmpty()){
				System.out.println("Empty!"); }
				else{
			System.out.print("Enter an index to search: ");
			int src = in.nextInt();if(src > link.size()){
					System.out.println("Invalid Index");}
					else{
			System.out.println(link.get(src));
			}}
			break;

			case 4:
				if(link.isEmpty()){
				System.out.println("Empty!");
				}else{
			System.out.print("Enter an updated value: ");
			int upd = in.nextInt();
			if(upd > link.size()){
					System.out.println("Invalid Index");}
					else{}}
			break;

			case 5:
				if(link.isEmpty()){
				System.out.println("Empty!");
				}else{
			System.out.print("Enter an index to remove: ");
			int rmv = in.nextInt();
			link.remove(rmv);
			System.out.println("Removed!");
			}
			break;

			case 6:
				if(link.isEmpty()){
				System.out.println("Empty!");
				}
			else{ System.out.println("Not Empty!");
			}
			break;
			case 7:
				System.out.print("Exiting...");
				return;
			default:
				System.out.print("Invalid Choice!");
				break;

}
}
}
}