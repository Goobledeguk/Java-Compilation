import java.util.Scanner;

public class ArrHighest{
	public static void main(String[]args){
			Scanner in = new Scanner(System.in);


			System.out.print("How many numbers: ");
			int chc = in.nextInt();

			int[] arr = new int[chc];

			for ( int i = 0; i < chc; i++){
				System.out.print("Enter a number: " + (i++));
				arr[i] = in.nextInt();
				}
	int max = arr[0];

	for( int i =0; i < chc; i++){
		if ( arr[i] > min ) {
			 max = arr[i];

		}
		}
		System.out.print("Highest: " + max);
	}
}