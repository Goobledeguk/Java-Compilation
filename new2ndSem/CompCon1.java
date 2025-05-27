import java.util.Scanner;

public class CompCon1{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your first string: ");
		String s1 = in.nextLine();

		in.nextLine();

		System.out.print("Enter your second string: ");
		String s2 = in.nextLine();

		if(s1.equals(s2)){
		System.out.println("They are equal");
			}
		else{
		System.out.println("They aren't equal");
		}

		System.out.println("Concat: " + s1.concat(s2));

		}
	}