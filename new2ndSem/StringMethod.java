import java.util.Scanner;

public class StringMethod{
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		String user = "Mcdonalds";
		String pass = "123";

		System.out.print("Enter Username: ");
		String us = in.nextLine();

		System.out.print("Enter Password: ");
		String ps = in.nextLine();

		if (user == us && pass == ps){
		Strng(user, pass, in);
		return;
		}
		else{System.out.println("Invalid Credentials");
		}
	}

	public static void Strng(String user, String pass,Scanner in){
		String n = "Welcome ";

		System.out.print(n.concat(user));

		System.out.print(pass.length());

		System.out.print("Enter index looking for substring:");
		int sub =in.nextInt();

		if ( sub >= 0  && sub < n.length()){
			String sbstng = n.substring(sub);
			System.out.print(sbstng);
		}
			else { System.out.print("Invalid substring");}

			System.out.print(user.equals(n));

			System.out.print(user.equalsIgnoreCase(n));

		}
	}