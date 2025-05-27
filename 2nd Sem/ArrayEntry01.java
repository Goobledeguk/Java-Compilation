import java.util.Scanner;

public class  ArrayEntry01{
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);


	System.out.print("How many Students to add: ");
	int ind = in.nextInt();


	int[] studId = new int[ind];
	String[] name = new String[ind];
	String[] course = new String[ind];
	int[] year = new int[ind];

	for(int i = 0; i < ind; i++){
			System.out.print("Enter student Id: ");
			studId[i] = in.nextInt();

			System.out.print("Enter student name: ");
			name[i] = in.nextLine();
			in.nextLine();
			System.out.print("Enter student course: ");
			course[i] = in.nextLine();

			System.out.print("Enter student year: ");
			year[i] = in.nextInt();

			System.out.println(" ");

			}

	for(int i = 0; i < ind; i++){
			System.out.println("Student Id:  " + studId[i]);
			System.out.println("Name: " + name[i]);
			System.out.println("Course: "+ course[i]);
			System.out.println("Year: " + year[i]);
			System.out.println("==========================");

			}
	}
}