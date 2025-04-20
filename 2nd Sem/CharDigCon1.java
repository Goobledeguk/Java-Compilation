import java.util.Scanner;

public class CharDigConv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a radix: ");
        int radix = scanner.nextInt();
        
        System.out.println("\nPlease choose one:");
        System.out.println("1 -- Convert digit to character");
        System.out.println("2 -- Convert character to digit");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("\nEnter a digit: ");
            int digit = scanner.nextInt();
            if (digit >= 0 && digit < radix) {
                char character = Character.forDigit(digit, radix);
                System.out.println("Convert digit to character: " + character);
            } else {
                System.out.println("Invalid digit for the given radix.");
            }
        } else if (choice == 2) {
            System.out.print("\nEnter a character: ");
            char character = scanner.next().charAt(0);
            int digit = Character.digit(character, radix);
            if (digit != -1) {
                System.out.println("Convert character to digit: " + digit);
            } else {
                System.out.println("Invalid character for the given radix.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
